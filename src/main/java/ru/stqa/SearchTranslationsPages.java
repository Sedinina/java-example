package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SearchTranslationsPages {
  WebDriver driver;
  public SearchTranslationsPages(WebDriver driver) {
    this.driver = driver;
  }
  By searchTranslationsSection = By.id("doc-search");
  By titleSearchTranslations = By.xpath("//h1[contains(text(),'Search Translations')]");

  public void clickSearchTranslations () {
    driver.findElement(searchTranslationsSection).click();
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleSearchTranslations);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
