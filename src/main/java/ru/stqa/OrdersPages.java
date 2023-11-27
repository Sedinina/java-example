package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrdersPages {

  WebDriver driver;
  public OrdersPages(WebDriver driver) {
    this.driver = driver;
  }
  By ordersSection = By.id("doc-orders");
  By titleOrdersPages = By.xpath("//h1[contains(text(),'Orders')]");

  public void clickTOrdersSection () {
    driver.findElement(ordersSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleOrdersPages);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
