package ru.stqa.menupage;

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

  public TaxClassesPages clickTaxClassesSection() {
    driver.findElement(taxClassesSection).click();
    return this;
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
