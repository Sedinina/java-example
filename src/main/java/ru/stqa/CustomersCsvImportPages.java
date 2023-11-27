package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CustomersCsvImportPages {

  WebDriver driver;
  public CustomersCsvImportPages(WebDriver driver) {
    this.driver = driver;
  }
  By customersCsvImportPageSection = By.id("doc-csv");
  By titleCustomersCsvImportPage = By.xpath("//h1[contains(text(),'CSV Import/Export')]");

  public void clickCustomersCsvImportSection () {
    driver.findElement(customersCsvImportPageSection).click();
  }
  public boolean isElementPresent() {
    try{
      driver.findElement(titleCustomersCsvImportPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
