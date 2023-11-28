package ru.stqa.menupage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class UsersPages {

  WebDriver driver;

  public UsersPages(WebDriver driver) {
    this.driver = driver;
  }

  By titleUsersPage = By.xpath("//h1[contains(text(),'Users')]");

  public boolean isElementPresent() {
    try {
      driver.findElement(titleUsersPage);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
