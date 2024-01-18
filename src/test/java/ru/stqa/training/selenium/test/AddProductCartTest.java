package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class AddProductCartTest extends TestBase {
  @Test
  public void addProductCartTest() {

    for (int i = 0; i < 3; i++) {
      driver.get("http://localhost/litecart/en/");
      WebElement numb_item = driver.findElement(By.cssSelector("span.quantity"));
      WebElement allProduct = driver.findElement(By.id("box-most-popular"));
      List<WebElement> product = allProduct.findElements(By.cssSelector("li[class*=product]"));
      product.get(i).click();
      driver.findElement(By.name("add_cart_product")).click();
      try {
        driver.findElement(By.linkText("View full page")).click();
      } catch (Exception e) {
        wait.until(stalenessOf(numb_item));
      }
    }

    driver.findElement(By.cssSelector("div#cart-wrapper a.link")).click();

    WebElement allProductCart = driver.findElement(By.id("checkout-cart-wrapper"));
    List<WebElement> productCart = allProductCart.findElements(By.className("shortcut"));
    int size = productCart.size();
    for (int i = 0; i < size; i++) {
      driver.findElement(By.name("remove_cart_item")).click();
      WebElement table = driver.findElement(By.cssSelector("table.dataTable.rounded-corners"));
      wait.until(stalenessOf(table));
    }
  }
}