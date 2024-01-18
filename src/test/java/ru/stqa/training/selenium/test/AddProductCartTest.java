package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

      if (driver.findElement(By.cssSelector("h1.title")).getText().equals("Yellow Duck")) {
        driver.findElements(By.className("options[Size]")).get(1).click();
      }
      driver.findElement(By.name("add_cart_product")).click();

      wait.until(stalenessOf(numb_item));
      wait.until(ExpectedConditions.attributeToBe(By.cssSelector("span.quantity"), "innerText", String.valueOf(i + 1)));

    }

    driver.findElement(By.cssSelector("div#cart-wrapper a.link")).click();

    WebElement allProductCart = driver.findElement(By.id("checkout-cart-wrapper"));
    List<WebElement> productCart = allProductCart.findElements(By.className("shortcut"));
    int size = productCart.size();
    for (int i = 0; i < size; i++) {
      WebElement table = driver.findElement(By.cssSelector("table.dataTable.rounded-corners"));
      driver.findElement(By.name("remove_cart_item")).click();
      wait.until(stalenessOf(table));
    }
  }
}