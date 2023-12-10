package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MenuTest extends TestBase {

  private LoginTest loginTest;


  public List<String> getElementNames(List<WebElement> elements){
    List<String> names = new ArrayList<String>();
    for(WebElement e : elements){
      names.add(e.getText());
    }
    return names;
  }

  @Test
  public void menuAdminTest() {

    loginTest = new LoginTest();
    loginTest.loginPageObjectTest();

    List<WebElement> menuItem = driver.findElements(By.className("name"));
    List<String> menuName = getElementNames(menuItem);

    for (String m : menuName) {

      driver.findElement(By.xpath("//span[text()='" + m + "']")).click();
      Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
      List<WebElement> menuSubItems = driver.findElements(By.cssSelector("[id^=doc-]"));
      List<String> leftSubMenuItemNames = getElementNames(menuSubItems);


      for (String sm : leftSubMenuItemNames) {
        System.out.println(sm);
        driver.findElement(By.xpath("//span[text()='" + sm + "']")).click();
        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
      }
    }
  }
}



