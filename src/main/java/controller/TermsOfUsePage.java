package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TermsOfUsePage extends ScriptBase {
    @FindBy(css = "#top")
    WebElement termsOfUse;

    public TermsOfUsePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void termsOfUse(WebDriver driver){

        driver.findElement(By.xpath("//div/footer//li[3]/a[@class='block']")).click();
        windowhandle(driver);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }


    public void windowhandle (WebDriver driver) {

        String windowHandleBefore = driver.getWindowHandle();

        for (String windHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windHandle);
        }


        Assert.assertEquals(termsOfUse,termsOfUse);
        driver.close();
        driver.switchTo().window(windowHandleBefore);

    }

}