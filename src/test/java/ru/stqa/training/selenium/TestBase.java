package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {

  public WebDriver driver;
  public WebDriverWait wait;

  @Before
  public void start() {
    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  }

  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
