package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;

import java.util.concurrent.TimeUnit;

public class PrivacyPolicyPage extends ScriptBase {
    @FindBy(css = "#top")
    WebElement privacyPolicies;



    public PrivacyPolicyPage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }
    public void privacyPolicy(WebDriver driver){

        driver.findElement(By.xpath("//div/footer//li[4]/a[@class='block']")).click();
        windowhandle(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void windowhandle (WebDriver driver) {

        String windowHandleBefore = driver.getWindowHandle();

        for (String windHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windHandle);
        }


        Assert.assertEquals(privacyPolicies, privacyPolicies);
        driver.close();
        driver.switchTo().window(windowHandleBefore);

    }

    public void onTestStart(ITestContext result) {

    }
}


