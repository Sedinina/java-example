package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SuppliersPages {

  WebDriver driver;
  public SuppliersPages(WebDriver driver) {
    this.driver = driver;
  }
  By suppliersSection = By.id("doc-suppliers");
  By titleSuppliersPage = By.xpath("//h1[contains(text(),'Suppliers')]");

  public void clickSuppliersSection () {
    driver.findElement(suppliersSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleSuppliersPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
