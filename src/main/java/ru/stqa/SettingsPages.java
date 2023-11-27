package ru.stqa;

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

  public void clickSettingsSection() {
    driver.findElement(storeInfoSection).click();
  }

  public void clickTitleSettingsPage() {
    driver.findElement(titleSettingsPage).click();
  }

  public void clickDefaultsSection() {
    driver.findElement(defaultsSection).click();
  }

  public void clickGeneralSection() {
    driver.findElement(generalSection).click();
  }

  public void clickListingsSection() {
    driver.findElement(listingsSection).click();
  }

  public void clickImagesSection() {
    driver.findElement(imagesSection).click();
  }

  public void clickCheckoutSection() {
    driver.findElement(checkoutSection).click();
  }

  public void clickAdvancedSection() {
    driver.findElement(advancedSection).click();
  }

  public void clickSecuritySection() {
    driver.findElement(securitySection).click();
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
