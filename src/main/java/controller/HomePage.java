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
    @FindBy(css ="body > div.wrapper > div.tools-bg.bleed > div.section-wrap > div > section.col2 > div > h2 > a")
    WebElement calculations;
    @FindBy(xpath = "//h1/a[@title='Car Buying Guides']")
    WebElement carBuyingGuides;
    @FindBy(css = "#articles_wrapper_st > li:nth-child(1) > article > a > div.img-container > img")
    WebElement fastestCar;
    @FindBy (css = "#articles_wrapper_st > li:nth-child(2) > article > a > div.img-container > img")
    WebElement luxuryCar;
    @FindBy(css = "#articles_wrapper_st > li:nth-child(4) > article > a > div.img-container > img")
    WebElement sportsCar;
    @FindBy(css = "#articles_wrapper_st > li:nth-child(5) > article > a > div.img-container > img")
    WebElement bigSedans;
//    @FindBy(css = "#aw0 > amp-img > img")
//    WebElement buyingGuides;
//    @FindBy(xpath = "//div[2]//div/ul/li[1]/a[@class='block']")
//    WebElement contact;

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
    public void comparison(WebDriver driver, String popCompare){
        mouseOver(driver.findElement(By.xpath("//*//a[@id='" + popCompare + "']")),driver);


    }

    public void calcuations(WebDriver driver,String calculation)throws InterruptedException{
        calculations.click();
        home.click();
        Thread.sleep(5000);
        mouseOver(driver.findElement(By.xpath("//section[2]//ul//a[contains(text(),'"+calculation+"')]")),driver);
    }

    public void carBuyingGuide(WebDriver driver) throws InterruptedException {
        carBuyingGuides.click();
        home.click();
        fastestCar.isDisplayed();
        luxuryCar.isDisplayed();
        sportsCar.isDisplayed();
        bigSedans.isDisplayed();
      //  Thread.sleep(500);
//        driver.findElement(By.cssSelector("#aw0 > amp-img > img")).isDisplayed();
//        Thread.sleep(500);

       // buyingGuides.click();
      //  home.click();
//        driver.switchTo().frame("https://tpc.googlesyndication.com/simgad/4091936537381294642");
//        Thread.sleep(500);
//        home.click();
//        driver.switchTo().frame("https://tpc.googlesyndication.com/simgad/10921202043608668027");
//        Thread.sleep(500);
//        home.click();
//        driver.switchTo().frame("https://tpc.googlesyndication.com/simgad/10921202043608668027");



    }

    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();


        }

    }
