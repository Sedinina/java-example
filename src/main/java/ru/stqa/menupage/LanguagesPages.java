package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LanguagesPages {

  WebDriver driver;
  public LanguagesPages(WebDriver driver) {
    this.driver = driver;
  }
  By languagesSection = By.id("doc-languages");
  By titleLanguagesPage = By.xpath("//h1[contains(text(),'Languages')]");

  public LanguagesPages clickLanguagesSection () {
    driver.findElement(languagesSection).click();
    return this;
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleLanguagesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
