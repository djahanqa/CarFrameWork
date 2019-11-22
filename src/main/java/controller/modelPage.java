package controller;

import base.ScriptBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;


public class modelPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='c4s_st'][@title='Cars for Sale']")
    WebElement carsForSale;
    @FindBy(id = "by_make_st")
    WebElement byMakers;
    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;
    @FindBy(xpath = "//*[@id='btnChooseModels'][@class='btn-primary lg']")
    WebElement nextModel;
    @FindBy(css = "#selectedMakes")
    WebElement selectedCar;



    public modelPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public void selectblock(WebDriver driver, String button) throws InterruptedException {

        carsForSale.click();
        byMakers.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'" + button + "')]")).click();
        nextModel.click();
        Assert.assertEquals(selectedCar,selectedCar);
        home.click();
    }

    public void onTestStart(ITestContext result) {

    }
}
