package ru.stqa.training.selenium.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.LoginPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
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
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) { //
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

  public static void logout(){
    driver.findElement(By.linkText("Logout")).click();
  }

  public void select(String selector, String value){
    Select select = new Select(driver.findElement(By.cssSelector(selector)));
    select.selectByVisibleText(value);
  }


  public List<String> getElementNames(List<WebElement> elements){
    List<String> names = new ArrayList<String>();
    for(WebElement e : elements){
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
  public void startChrome(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  }


  @After
  public void stop() {
    driver.quit();
    driver = null;
  }
}
