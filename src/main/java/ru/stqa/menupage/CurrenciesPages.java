package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CurrenciesPages {

  WebDriver driver;
  public CurrenciesPages(WebDriver driver) {
    this.driver = driver;
  }

  By titleCurrenciesPage = By.xpath("//h1[contains(text(),'Currencies')]");

  public boolean isElementPresent() {
    try{
      driver.findElement(titleCurrenciesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
