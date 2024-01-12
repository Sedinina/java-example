package ru.stqa.training.selenium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;
import java.util.StringTokenizer;

public class CampaignsTest extends TestBase {

  public static Color getColor(String color){
    StringTokenizer st = new StringTokenizer(color.substring(5));
    int r = Integer.parseInt(st.nextToken(",").trim());
    int g = Integer.parseInt(st.nextToken(",").trim());
    int b = Integer.parseInt(st.nextToken(",").trim());
    return new Color(r, g, b);
  }


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

        //проверка, что серого цвета на главной странице
        Assert.assertTrue(getColor(regPriceColorHomePage).getRed()==getColor(regPriceColorHomePage).getGreen()  && getColor(regPriceColorHomePage).getGreen()==getColor(regPriceColorHomePage).getBlue());
        //проверка, что серого цвета на главной странице
        Assert.assertTrue(getColor(regPriceColorProductPage).getRed()==getColor(regPriceColorProductPage).getGreen()  && getColor(regPriceColorProductPage).getGreen()==getColor(regPriceColorProductPage).getBlue());

        //проверка, что красного цвета на главной странице
        Assert.assertTrue(getColor(camPriceColorHomePage).getBlue()==0 && getColor(camPriceColorHomePage).getGreen()==0);
        //проверка, что красного цвета на главной странице
        Assert.assertTrue(getColor(camPriceColorProductPage).getBlue()==0 && getColor(camPriceColorProductPage).getGreen()==0);
      }
    }
  }




}
