package controller;

import base.ScriptBase;
import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class CarsForSalePage extends ScriptBase {

    @FindBy(xpath = "//*[@id='c4s_st'][@title='Cars for Sale']")
    WebElement carsForSale;
    @FindBy(id = "btnShowAllMakesB")
    WebElement allMakers;
    @FindBy(xpath = "//*[@id='zip_verify_overlay_js']//h1[@class='h1']")
    WebElement showResult;
    @FindBy(xpath = "//*[@id='zip_verify_overlay_js']//button[@class='query_btn_js btn-primary block lg']")
    WebElement continueBotton;
    @FindBy(id = "price_menu_selected_value_js")
    WebElement price;
    @FindBy(id = "prices_min_textbox_js")
    WebElement min;
    @FindBy(id = "prices_max_textbox_js")
    WebElement max;
    @FindBy(id = "button_prices_apply_js")
    WebElement apply;
    @FindBy(id="by_make_st")
    WebElement byMakers;

    public CarsForSalePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    public void carsale(WebDriver driver) throws InterruptedException {
        carsForSale.click();
        allMakers.click();
        Assert.assertEquals(showResult, showResult);
        continueBotton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        price.isSelected();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id='prices_min_textbox_js'][@type='text']")).isSelected();
        //driver.findElement(Bxpath("//*[@id='prices_min_textbox_js'][@type='text']")).isSelected();
        driver.findElement(xpath("//*[@id='prices_max_textbox_js'][@type='text']")).isSelected();

        apply.isSelected();

    }

    public void iframe(WebDriver driver) {
        driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
        driver.quit();


    }
    public void selectMakeFromList(WebDriver driver,String list) throws InterruptedException{
        carsForSale.click();
        driver.findElement(By.xpath("//*[@id='by_make_js']//section/h1[contains(text(),'" + list + "')]")).isDisplayed();


        }

    public void onTestStart(ITestContext result) {

    }
}
//    private void dropdown(WebElement element, WebDriver driver) {
//        Select select = new Select(element);
//
//private void cow(WebElement element, WebDriver driver) {
//
//
//    Actions action = new Actions(driver);
//action.moveToElement(element).click().perform();

//    }
//
//
//    public void dropdown(WebDriver driver,WebElement element, String min,String max) {
//        Select select = new Select(element);
//        select.selectByVisibleText(min);
//        select.selectByVisibleText(max);




