package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class TaxRatesPages {

  WebDriver driver;

  public TaxRatesPages(WebDriver driver) {
    this.driver = driver;
  }

  By taxRatesSection = By.id("doc-tax_rates");
  By titleTaxRatesPage = By.xpath("//h1[contains(text(),'Tax Rates')]");

  public TaxRatesPages clickTaxRatesSection() {
    driver.findElement(taxRatesSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleTaxRatesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
