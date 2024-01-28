package ru.stqa.training.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

public class LinkNewWindowTest extends TestBase {
  LoginTest loginTest;

  public ExpectedCondition<String> anyWindowOtherThan(final Set<String> oldWindows) {
    return new ExpectedCondition<String>() {
      public String apply(WebDriver driver) {
        Set<String> handles = driver.getWindowHandles();
        handles.removeAll(oldWindows);
        return handles.size() > 0 ? handles.iterator().next() : null;
      }
    };
  }

  @Test
  public void linkNewWindowTest() {

    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();

    driver.findElement(By.cssSelector("a[href*='countries']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    driver.findElement(By.cssSelector("a[href*='AQ']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    List<WebElement> link = driver.findElements(By.className("fa-external-link"));
    int size = link.size();

    if (size != 0) {
      for (WebElement element : link) {
        String originalWindow = driver.getWindowHandle();
        Set<String> oldWindows = driver.getWindowHandles();

        element.click();
        String newWindow = wait.until(anyWindowOtherThan(oldWindows));
        driver.switchTo().window(newWindow);
        driver.close();
        driver.switchTo().window(originalWindow);

      }
    }
  }
}
