package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class GeoZonesPages {

  WebDriver driver;
  public GeoZonesPages(WebDriver driver) {
    this.driver = driver;
  }

  By titleGeoZonesPage = By.xpath("//h1[contains(text(),'Geo Zones')]");

  public boolean isElementPresent() {
    try{
      driver.findElement(titleGeoZonesPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
