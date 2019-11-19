package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AboutPage extends ScriptBase {
    @FindBy(css = "#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")
    WebElement about;

    public AboutPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void aboutInfo(WebDriver driver){

        driver.findElement(By.xpath("//div/footer//li[2]/a[@class='block']")).click();

    }
}