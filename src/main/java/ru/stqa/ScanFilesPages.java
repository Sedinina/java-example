package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ScanFilesPages {
  WebDriver driver;
  public ScanFilesPages(WebDriver driver) {
    this.driver = driver;
  }
  By scanFilesSection = By.id("doc-scan");
  By titleScanFilesPage = By.xpath("//h1[contains(text(),'Scan Files For Translations')]");

  public void clickScanFilesSection () {
    driver.findElement(scanFilesSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleScanFilesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
