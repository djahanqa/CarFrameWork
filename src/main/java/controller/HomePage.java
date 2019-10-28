package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ScriptBase {
    @FindBy(id = "i_carLogo")
    WebElement logo;
    @FindBy(id="research_st")
    WebElement research;
    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;
    @FindBy(xpath = "//*[@id='c4s_st'][@title='Cars for Sale']")
    WebElement carsForSale;
    @FindBy(xpath = "//div[4]/div[2]//a[@class='home-header']")
    WebElement tools;
    @FindBy(xpath = "//a[@title='Car Comparison']")
    WebElement carComparison;

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void companylogo(WebDriver driver)throws InterruptedException{
        logo.isDisplayed();
        mouseOver(research,driver);
        research.click();
        mouseOver(home,driver);
        Thread.sleep(5000);
        home.click();
        mouseOver(carsForSale,driver);
        carsForSale.click();
        home.click();

    }
    public void tools(WebDriver driver){
        mouseOver(tools,driver);
        tools.click();
        home.click();

    }
    public void carComparisons(WebDriver driver) {
        carComparison.click();
        home.click();

    }
    public void hondaOdysseyVSToyotaSienna(WebDriver driver, String popCompare){
        mouseOver(driver.findElement(By.xpath("//*//a[@id='" + popCompare + "']")),driver);


    }
    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }
}