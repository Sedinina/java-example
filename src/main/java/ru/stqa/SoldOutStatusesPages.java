package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SoldOutStatusesPages {

  WebDriver driver;
  public SoldOutStatusesPages(WebDriver driver) {
    this.driver = driver;
  }
  By soldOutStatusesSection = By.id("doc-sold_out_statuses");
  By titleSoldOutStatusesPage = By.xpath("//h1[contains(text(),'Sold Out Statuses')]");

  public void clickSoldOutStatusesSection () {
    driver.findElement(soldOutStatusesSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleSoldOutStatusesPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

}
