package ru.stqa.training.selenium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CountryTest extends TestBase {

  private LoginTest loginTest;

  List<WebElement> rowNameCountry;

  List<WebElement> rowZones;

  public void tableCountry() {
    rowNameCountry = driver.findElements(By.cssSelector("tr.row td:nth-of-type(5)"));
    rowZones = driver.findElements(By.cssSelector("tr.row td:nth-of-type(6)"));
  }

  public void tableZone() {
    rowNameCountry = driver.findElements(By.cssSelector("table.dataTable td:nth-of-type(3)"));
  }


  @Test
  public void sortingCountriesTest() {

    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();
    driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");

    tableCountry();
    int size = rowNameCountry.size();
    System.out.println(size);
    for (int i = 0; i < rowNameCountry.size() - 1; i++) {
      String countryName = rowNameCountry.get(i).getText();
      String countryNameNext = rowNameCountry.get(i + 1).getText();
      System.out.println(countryName);
      Assert.assertTrue(countryNameNext.compareTo(countryName) > 0);

      int zone = Integer.parseInt(rowZones.get(i).getText());
      if (zone > 1) {

        driver.findElement(By.linkText(countryName)).click();
        List<WebElement> allZones = driver.findElements(By.cssSelector("table.dataTable td:nth-of-type(3)"));
        int sizeZone = allZones.size();
        System.out.println(sizeZone);


        for (int j = 0; j < sizeZone - 1; j++) {
          String zoneName = allZones.get(j).getText();
          String zoneNameNext = allZones.get(j + 1).getText();
          System.out.println(zoneName);
          if (zoneNameNext.compareTo(zoneName) > 0) {
          }

        }
        driver.navigate().back();
        tableCountry();
      }
    }
  }

  @Test
  public void sortingZoneTest() {
    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();
    driver.get("http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones");
    tableZone();
    int size = rowNameCountry.size();

    for (int i = 0; i < size; i++) {
      String countryName = rowNameCountry.get(i).getText();
      driver.findElement(By.linkText(countryName)).click();

      List<WebElement> row = driver.findElements(By.cssSelector("[name*=zone_code]"));
      int sizeZone = row.size();
      System.out.println(sizeZone);

      for (int j = 0; j < sizeZone - 1; j++) {

        String zoneName = row.get(j).findElement(By.cssSelector("option[selected=selected]")).getText();
        String nextZoneName = row.get(j + 1).findElement(By.cssSelector("option[selected=selected]")).getText();
        System.out.println(zoneName);
        Assert.assertTrue(nextZoneName.compareTo(zoneName) > 0);
      }
      driver.findElement(By.cssSelector("button[name=cancel]")).click();
      tableZone();
    }
  }

}


