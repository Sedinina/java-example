package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class TaxClassesPages {


  WebDriver driver;

  public TaxClassesPages(WebDriver driver) {
    this.driver = driver;
  }

  By taxClassesSection = By.id("doc-tax_classes");
  By titleTaxClassesPage = By.xpath("//h1[contains(text(),'Template')]");

  public void clickTaxClassesSection() {
    driver.findElement(taxClassesSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleTaxClassesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
