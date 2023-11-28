package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrderTotalModulesPages {

  WebDriver driver;
  public OrderTotalModulesPages(WebDriver driver) {
    this.driver = driver;
  }
  By orderTotalSection = By.id("doc-order_total");
  By titleOrderTotalModule = By.xpath("//h1[contains(text(),'Order Total Modules')]");

  public OrderTotalModulesPages clickOrderTotalSection () {
    driver.findElement(orderTotalSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleOrderTotalModule);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
