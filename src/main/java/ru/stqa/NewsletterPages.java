package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class NewsletterPages {

  WebDriver driver;
  public NewsletterPages(WebDriver driver) {
    this.driver = driver;
  }
  By newsletterSection = By.id("doc-newsletter");
  By titleNewsletterPage = By.xpath("//h1[contains(text(),'Newsletter')]");

  public void clickNewsletterSection () {
    driver.findElement(newsletterSection).click();
  }

  public boolean isElementPresent() {
    try{
      driver.findElement(titleNewsletterPage);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
