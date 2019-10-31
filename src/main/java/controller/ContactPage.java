package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ContactPage extends ScriptBase {


    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;


    public ContactPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void contactInfo(WebDriver driver){
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div[2]/footer/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//footer//li[1]/a[@class='block']")).click();

    }


    }


