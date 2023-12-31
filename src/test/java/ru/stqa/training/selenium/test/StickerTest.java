package ru.stqa.training.selenium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StickerTest extends TestBase {

  @Test
  public void countStickerTest() {
    By product = By.cssSelector("li[class*=product]");
    By sticker = By.className("sticker");

    driver.get("http://localhost/litecart/en/");
    List<WebElement> productList = driver.findElements(product);

    for (WebElement s : productList) {
      Assert.assertEquals(s.findElements(sticker).size(), 1);
    }

  }
}
