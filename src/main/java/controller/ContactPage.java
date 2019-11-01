package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ContactPage extends ScriptBase {


    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;
    @FindBy(css = "#js-promo-popup > div > div.temp2-col-main.company > div.col-pad")
    WebElement contact;

    @FindBy(css = "#top")
    WebElement privacyPolicies;

    public ContactPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    public void contactInfo(WebDriver driver) {


        driver.findElement(By.xpath("//footer//li[1]/a[@class='block']")).click();

        windowhandle(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    public void privacyPolicy(WebDriver driver){

        driver.findElement(By.xpath("//div/footer//li[4]/a[@class='block']")).click();
        windowhandle(driver);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

 public void windowhandle (WebDriver driver) {

        String windowHandleBefore = driver.getWindowHandle();

        for (String windHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windHandle);
        }

        Assert.assertEquals(contact,contact);

        Assert.assertEquals(privacyPolicies,privacyPolicies);
        driver.close();
        driver.switchTo().window(windowHandleBefore);


    }
}


