package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CustomersPages {

  WebDriver driver;
  public CustomersPages(WebDriver driver) {
    this.driver = driver;
  }
  By customersSection = By.id("doc-customers");
  By titleCustomersPage = By.xpath("//h1[contains(text(),'Customers')]");

  public void clickCustomersSection () {
    driver.findElement(customersSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleCustomersPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
