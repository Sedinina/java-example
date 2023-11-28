package ru.stqa.menupage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MenuAdmin {
  WebDriver driver;
  By appearanceSection = By.xpath("//span[contains(text(),'Appearence')]");
  By catalogSection =By.xpath("//span[contains(text(),'Catalog')]");
  By countriesSection =By.xpath("//span[contains(text(),'Countries')]");
  By currenciesSection =By.xpath("//span[contains(text(),'Currencies')]");
  By customersSection =By.xpath("//span[contains(text(),'Customers')]");
  By geoZonesSection =By.xpath("//span[contains(text(),'Geo Zones')]");
  By languagesSection =By.xpath("//span[contains(text(),'Languages')]");
  By modulesSection =By.xpath("//span[contains(text(),'Modules')]");
  By ordersSection =By.xpath("//span[contains(text(),'Orders')]");
  By pagesSection =By.xpath("//span[contains(text(),'Pages')]");
  By reportsSection =By.xpath("//span[contains(text(),'Reports')]");
  By settingsSection =By.xpath("//span[contains(text(),'Settings')]");
  By slidesSection =By.xpath("//span[contains(text(),'Slides')]");
  By taxSection =By.xpath("//span[contains(text(),'Tax')]");
  By translationsSection =By.xpath("//span[contains(text(),'Translations')]");
  By usersSection =By.xpath("//span[contains(text(),'Users')]");
  By vQmodsSection =By.xpath("//span[contains(text(),'vQmods')]");

  public MenuAdmin(WebDriver driver) {
    this.driver = driver;
  }

  public void clickAppearanceSection () {
    driver.findElement(appearanceSection).click();
  }

  public void clickCatalogSection () {
    driver.findElement(catalogSection).click();
  }

  public void clickCountriesSection () {
    driver.findElement(countriesSection).click();
  }

  public void clickCurrenciesSection () {
    driver.findElement(currenciesSection).click();
  }

  public void clickCustomersSection () {
    driver.findElement(customersSection).click();
  }

  public void clickGeoZonesSection () {
    driver.findElement(geoZonesSection).click();
  }

  public void clickLanguagesSection () {
    driver.findElement(languagesSection).click();
  }
  public void clickModulesSection () {
    driver.findElement(modulesSection).click();
  }
  public void clickOrdersSection () {
    driver.findElement(ordersSection).click();
  }

  public void clickPagesSection () {
    driver.findElement(pagesSection).click();
  }

  public void clickReportsSection () {
    driver.findElement(reportsSection).click();
  }

  public void clickSettingsSection () {
    driver.findElement(settingsSection).click();
  }

  public void clickSlidesSection () {
    driver.findElement(slidesSection).click();
  }

  public void clickTaxSection () {
    driver.findElement(taxSection).click();
  }
  public void clickTranslationsSection () {
    driver.findElement(translationsSection).click();
  }
  public void clickUsersSection () {
    driver.findElement(usersSection).click();
  }

  public void clickVQmodsSection () {
    driver.findElement(vQmodsSection).click();
  }

}
