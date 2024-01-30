package ru.stqa.training.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class CartPage extends Page {
  public CartPage(WebDriver driver) {
    super(driver);
  }

  public int listProductCart() {
    WebElement allProductCart = driver.findElement(By.id("checkout-cart-wrapper"));
    List<WebElement> productCart = allProductCart.findElements(By.className("shortcut"));
    return productCart.size();
  }


  public CartPage waitTable() {
    wait.until(stalenessOf(driver.findElement(By.cssSelector("table.dataTable.rounded-corners"))));
    return this;
  }

  public CartPage clickButtonRemove() {
    driver.findElement(By.cssSelector("button[name=remove_cart_item]")).click();
    return this;
  }
}
