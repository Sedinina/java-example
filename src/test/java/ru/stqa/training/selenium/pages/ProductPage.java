package ru.stqa.training.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends Page {
  public ProductPage(WebDriver driver) {
    super(driver);
  }


  public ProductPage selectOptions() {
    if (isElementPresent(By.className("options"))) {
      Select select = new Select(driver.findElement(By.cssSelector("select")));
      select.selectByValue("Small");
    }
    return this;
  }

  public ProductPage updateCounter(int i) {
    wait.until(ExpectedConditions.attributeToBe(By.cssSelector("span.quantity"), "innerText", String.valueOf(i + 1)));
    return this;
  }


  public ProductPage clickButtonAddCart() {
    driver.findElement(By.cssSelector("button[name=add_cart_product]")).click();
    return this;
  }

  public ProductPage clickButtonCart() {
    driver.findElement(By.cssSelector("div#cart-wrapper a.link")).click();
    return this;
  }

}
