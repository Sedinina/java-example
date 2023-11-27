package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CatalogCsvImportPages {

  WebDriver driver;

  public CatalogCsvImportPages(WebDriver driver) {
    this.driver = driver;
  }

  By catalogCsvImportSection = By.id("doc-csv");
  By titleCatalogCsvImportPage = By.xpath("//h1[contains(text(),'CSV Import/Export')]");

  public void clickCatalogCsvImportSection() {
    driver.findElement(catalogCsvImportSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleCatalogCsvImportPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
