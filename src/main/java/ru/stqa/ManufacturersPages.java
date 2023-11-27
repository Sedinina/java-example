package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ManufacturersPages {
  WebDriver driver;
  public ManufacturersPages(WebDriver driver) {
    this.driver = driver;
  }
  By manufacturersSection = By.id("doc-manufacturers");
  By titleManufacturersPage = By.xpath("//h1[contains(text(),'Manufacturers')]");

  public void clickManufacturersSection () {
    driver.findElement(manufacturersSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleManufacturersPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
