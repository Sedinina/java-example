package ru.stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  WebDriver driver;
  By usernameLocator = By.name("username");
  By passwordLocator = By.name("password");
  By buttonLocator = By.name("login");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public LoginPage fillUsername(String username) {
    driver.findElement(usernameLocator).sendKeys(username);
    return this;
  }

  public LoginPage fillPassword(String password) {
    driver.findElement(passwordLocator).sendKeys(password);
    return this;
  }

  public LoginPage clickButton() {
    driver.findElement(buttonLocator).click();
    return this;
  }

  public LoginPage openPage() {
    driver.get("http://localhost/litecart/admin/login.php");
    return this;
  }
}
