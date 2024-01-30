package ru.stqa.training.selenium.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.LoginPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class TestBase {

  public static EventFiringWebDriver driver;
  public static WebDriverWait wait;

//  public static class MyListener extends AbstractWebDriverEventListener {
//    @Override
//    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//      System.out.println(by);
//    }
//
//    @Override
//    public void afterFindBy(By by, WebElement element, WebDriver driver) {
//      System.out.println(by + " found");
//    }
//
//    @Override
//    public void onException(Throwable throwable, WebDriver driver) {
//      System.out.println(throwable);
//      File tmp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//      File screen = new File("screen " + System.currentTimeMillis()+".png");
//      try{
//        Files.copy(tmp.toPath(), screen.toPath());
//      }catch (IOException e){
//        e.printStackTrace();
//      }
//      System.out.println(screen);
//    }
//  }

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
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean isElementPresentExplicit(By locator) {
    try {
      wait.until(webDriver -> driver.findElement(locator)); //явное ожидание
      return true;
    } catch (TimeoutException ex) {
      return false;
    }
  }

  public static void logout() {
    driver.findElement(By.linkText("Logout")).click();
  }

  public void select(String selector, String value) {
    Select select = new Select(driver.findElement(By.cssSelector(selector)));
    select.selectByVisibleText(value);
  }


  public List<String> getElementNames(List<WebElement> elements) {
    List<String> names = new ArrayList<String>();
    for (WebElement e : elements) {
      names.add(e.getText());
    }
    return names;
  }

//  @Before
//  public void startFirefox() {
//    driver = new FirefoxDriver();
//    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //неявное ожидание
//    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//  }

  @Before
  public void startChrome() {
    driver = new EventFiringWebDriver(new ChromeDriver());
    //driver.register(new MyListener());
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  }


  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
