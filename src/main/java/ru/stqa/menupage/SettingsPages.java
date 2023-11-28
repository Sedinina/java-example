package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SettingsPages {

  WebDriver driver;

  public SettingsPages(WebDriver driver) {
    this.driver = driver;  }

  By storeInfoSection = By.id("doc-store_info");
  By titleSettingsPage = By.xpath("//h1[contains(text(),'Settings')]");
  By defaultsSection = By.id("doc-defaults");
  By generalSection = By.id("doc-general");
  By listingsSection = By.id("doc-listings");
  By imagesSection = By.id("doc-images");
  By checkoutSection = By.id("doc-checkout");
  By advancedSection = By.id("doc-advanced");
  By securitySection = By.id("doc-security");

  public SettingsPages clickSettingsSection() {
    driver.findElement(storeInfoSection).click();
    return this;
  }

  public SettingsPages clickTitleSettingsPage() {
    driver.findElement(titleSettingsPage).click();
    return this;
  }

  public SettingsPages clickDefaultsSection() {
    driver.findElement(defaultsSection).click();
    return this;
  }

  public SettingsPages clickGeneralSection() {
    driver.findElement(generalSection).click();
    return this;
  }

  public SettingsPages clickListingsSection() {
    driver.findElement(listingsSection).click();
    return this;
  }

  public SettingsPages clickImagesSection() {
    driver.findElement(imagesSection).click();
    return this;
  }

  public SettingsPages clickCheckoutSection() {
    driver.findElement(checkoutSection).click();
    return this;
  }

  public SettingsPages clickAdvancedSection() {
    driver.findElement(advancedSection).click();
    return this;
  }

  public SettingsPages clickSecuritySection() {
    driver.findElement(securitySection).click();
    return this;
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(titleSettingsPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
