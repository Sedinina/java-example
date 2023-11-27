package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrderSuccessModulesPages {

  WebDriver driver;
  public OrderSuccessModulesPages(WebDriver driver) {
    this.driver = driver;
  }
  By orderSuccessSection = By.id("doc-order_success");
  By titleSuccessPage = By.xpath("//h1[contains(text(),'Order Success Modules')]");

  public void clickOrderSuccessSection () {
    driver.findElement(orderSuccessSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleSuccessPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
