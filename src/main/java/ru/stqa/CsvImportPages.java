package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CsvImportPages {

  WebDriver driver;
  public CsvImportPages(WebDriver driver) {
    this.driver = driver;
  }
  By csvImportPagesSection = By.id("doc-csv");
  By titleCSVImportPagesPage = By.xpath("//h1[contains(text(),'CSV Import/Export')]");

  public void clickCSVImportSection () {
    driver.findElement(csvImportPagesSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleCSVImportPagesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
