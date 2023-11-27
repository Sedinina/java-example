package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CountriesPages {

  WebDriver driver;
  public CountriesPages(WebDriver driver) {
    this.driver = driver;
  }

  By titleCountriesPage = By.xpath("//h1[contains(text(),'Countries')]");

  public boolean isElementPresent() {
    try{
      driver.findElement(titleCountriesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }


}
