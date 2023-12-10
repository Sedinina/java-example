package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.LoginPage;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestBase {

  public static WebDriver driver;
  public static WebDriverWait wait;

/*  @Before
  public void startChrome() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-fullscreen"); //в полноэкранном режиме
    options.addArguments("start-maximized"); //во все окно
    driver = new ChromeDriver(options);
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("unexpectedAlertBehaviour", "dismiss");
    System.out.println(((HasCapabilities) driver).getCapabilities());
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    //куки
    driver.manage().addCookie(new Cookie("test", "test"));
    Cookie testCookie = driver.manage().getCookieNamed("test");
    Set<Cookie> cookies = driver.manage().getCookies();
    driver.manage().deleteCookieNamed("test");
    driver.manage().deleteAllCookies();
  }*/


  public boolean isElementPresent(By locator) {
    try {
      //wait.until(webDriver -> driver.findElement(locator)); явное ожидание
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) { //TimeoutException
      return false;
    }
  }

  @Before
  public void startFirefox() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //неявное ожидание
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  }


  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
