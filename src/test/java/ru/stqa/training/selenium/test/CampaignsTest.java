package ru.stqa.training.selenium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CampaignsTest extends TestBase {

  @Test
  public void correctProductPageTest() {
    driver.get("http://localhost/litecart/en/");

    WebElement allCampaigns = driver.findElement(By.id("box-campaigns"));

    List<WebElement> productCampaigns = allCampaigns.findElements(By.cssSelector("li[class*=product]"));

    int size = productCampaigns.size();

    if (size==0){
      System.out.println("В разделе пусто");
    } else {
      for (int i=0; i<size; i++){
        String productNameHomePage = productCampaigns.get(i).findElement(By.cssSelector("div.name")).getText();
        Double regularPriceProductHomePage =   Double.valueOf(productCampaigns.get(i).findElement(By.cssSelector(".regular-price")).getText().substring(1));
        String regPriceColorHomePage = productCampaigns.get(i).findElement(By.cssSelector(".regular-price")).getCssValue("color");
        String textDecorationRegPriceHomePage = productCampaigns.get(i).findElement(By.cssSelector(".regular-price")).getCssValue("text-decoration-line");
        Double sizeRegPriceHomePage = Double.valueOf(productCampaigns.get(i).findElement(By.cssSelector(".regular-price")).getCssValue("font-size").substring(0,2));

        Double campaignPriceProductHomePage =   Double.valueOf(productCampaigns.get(i).findElement(By.cssSelector(".campaign-price")).getText().substring(1));
        String camPriceColorHomePage =productCampaigns.get(i).findElement(By.cssSelector(".campaign-price")).getCssValue("color");
        String camPriceBoldHomePage = productCampaigns.get(i).findElement(By.cssSelector(".campaign-price")).getTagName();
        Double sizeCamPriceHomePage = Double.valueOf(productCampaigns.get(i).findElement(By.cssSelector(".campaign-price")).getCssValue("font-size").substring(0,2));

        //переходим на страницу товара
        productCampaigns.get(i).click();

        String productNameProductPage = driver.findElement(By.cssSelector("h1[itemprop='name']")).getText();
        Double regularPriceProductPage =   Double.valueOf(driver.findElement(By.cssSelector(".regular-price")).getText().substring(1));
        String regPriceColorProductPage = driver.findElement(By.cssSelector(".regular-price")).getCssValue("color");
        String textDecorationRegPriceProductPage = driver.findElement(By.cssSelector(".regular-price")).getCssValue("text-decoration-line");
        Double sizeRegPriceProductPage = Double.valueOf(driver.findElement(By.cssSelector(".regular-price")).getCssValue("font-size").substring(0,2));

        Double campaignPriceProductPage =   Double.valueOf(driver.findElement(By.cssSelector(".campaign-price")).getText().substring(1));
        String camPriceColorProductPage =driver.findElement(By.cssSelector(".campaign-price")).getCssValue("color");
        String camPriceBoldProductPage = driver.findElement(By.cssSelector(".campaign-price")).getTagName();
        Double sizeCamPriceProductPage = Double.valueOf(driver.findElement(By.cssSelector(".campaign-price")).getCssValue("font-size").substring(0,2));

        //проверка, что акционная цена крупнее, чем обычная на главной странице
        Assert.assertTrue( sizeCamPriceHomePage>sizeRegPriceHomePage);

        //проверка, что текст названия товара совпадает
        Assert.assertEquals(productNameHomePage, productNameProductPage);
        //проверка, что обычная цена совпадает(текст)
        Assert.assertEquals(regularPriceProductHomePage, regularPriceProductPage);
        //проверка, что акционная цена совпадает(текст)
        Assert.assertEquals(campaignPriceProductHomePage, campaignPriceProductPage);

        //проверка, что серого цвета на главной странице
        Assert.assertEquals(regPriceColorHomePage, "rgba(119, 119, 119, 1)");
        //проверка, что серого цвета на главной странице
        Assert.assertEquals(regPriceColorProductPage, "rgba(102, 102, 102, 1)");

        //проверка, что красного цвета на главной странице
        Assert.assertEquals(camPriceColorHomePage, "rgba(204, 0, 0, 1)");
        //проверка, что красного цвета на главной странице
        Assert.assertEquals(camPriceColorProductPage, "rgba(204, 0, 0, 1)");


        //проверка, что обычная цена зачеркнутая на главной странице
        Assert.assertEquals(textDecorationRegPriceHomePage, "line-through");
        //проверка, что обычная цена зачеркнутая на странице продукта
        Assert.assertEquals(textDecorationRegPriceProductPage, "line-through");

        //проверка, что акционная цена на странице товара написана жирным
        Assert.assertEquals(camPriceBoldHomePage, "strong");
        //проверка, что акционная цена на странице товара написана жирным
        Assert.assertEquals(camPriceBoldProductPage, "strong");


        //проверка, что акционная цена крупнее, чем обычная на странице товара
        Assert.assertTrue( sizeCamPriceProductPage>sizeRegPriceProductPage);
      }
    }
  }




}
