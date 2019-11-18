package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatagoryPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='c4s_st'][@title='Cars for Sale']")
    WebElement carsForSale;
    @FindBy(id = "by_make_st")
    WebElement byMakers;
    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;

    public CatagoryPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void carCatagory(WebDriver driver, String car ){
    carsForSale.click();
    byMakers.click();
    driver.findElement(By.xpath("//*[@id='categories_js']/licontains(text(),'"+car+"')")).click();
}
}