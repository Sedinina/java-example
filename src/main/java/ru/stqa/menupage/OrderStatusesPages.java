package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrderStatusesPages {

  WebDriver driver;
  public OrderStatusesPages(WebDriver driver) {
    this.driver = driver;
  }
  By orderStatusSection = By.id("doc-order_statuses");
  By titleOrderStatusesPage = By.xpath("//h1[contains(text(),'Order Statuses')]");

  public OrderStatusesPages clickOrderStatusesSection () {
    driver.findElement(orderStatusSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleOrderStatusesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
