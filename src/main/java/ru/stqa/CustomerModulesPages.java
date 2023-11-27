package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CustomerModulesPages {

  WebDriver driver;
  public CustomerModulesPages(WebDriver driver) {
    this.driver = driver;
  }
  By customerModulesSection = By.id("doc-customer");
  By titleCustomerModulesPage = By.xpath("//h1[contains(text(),'Customer Modules')]");

  public void clickCustomerModulesSection () {
    driver.findElement(customerModulesSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleCustomerModulesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
