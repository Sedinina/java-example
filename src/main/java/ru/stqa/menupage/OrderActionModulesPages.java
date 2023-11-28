package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrderActionModulesPages {

  WebDriver driver;

  public OrderActionModulesPages(WebDriver driver) {
    this.driver = driver;
  }

  By orderActionSection = By.id("doc-order_action");
  By titleOrderActionModulesPage = By.xpath("//h1[contains(text(),'Order Action Modules')]");

  public OrderActionModulesPages clickOrderActionSection() {
    driver.findElement(orderActionSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleOrderActionModulesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
