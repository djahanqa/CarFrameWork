package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ContactPage extends ScriptBase {
    @FindBy(css = "#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")
    //@FindBy(xpath = "//*//div[@class='col-pad']")
            WebElement contactUs;

    public ContactPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void contactInfo(WebDriver driver,String socialMedia) throws InterruptedException {
        scroll(driver.findElement(By.cssSelector("body > div.wrapper > div.tools-bg.bleed > div.mask-lt")), driver);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[2]//li[1]/a[@class='block']")).click();

        windowhandle(driver);

        scroll(driver.findElement(By.cssSelector("#js-promo-popup > div > div.temp2-col-main.company > div.col-pad > h1")),driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Like on Facebook']")).click();


    }
    public void popop(WebDriver driver){
        driver.switchTo().alert().dismiss();
        driver.close();

    }


    public void scroll(WebElement element,WebDriver driver) {
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.getText();
    }

    public void windowhandle(WebDriver driver){

        String windowHandleBefore = driver.getWindowHandle();

        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String actualTitle = driver.getTitle();

// driver.close();

// driver.switchTo().window(windowHandleBefore);


    }

}
