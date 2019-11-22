package controller;
import org.openqa.selenium.JavascriptExecutor;
import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;

public class CarPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='c4s_st'][@title='Cars for Sale']")
    WebElement carsForSale;
    @FindBy(id = "by_make_st")
    WebElement byMakers;
    @FindBy(css="#sidepanel_wrap_js > section > header > a > span > svg")
    WebElement home;
    @FindBy(id="btnChooseMakesB")
    WebElement choosemaker;
    public CarPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void carCatagory(WebDriver driver,String car) throws InterruptedException {
        carsForSale.click();
        byMakers.click();
        Thread.sleep(5000);
        scroll(driver.findElement(By.xpath("/html/body/div[4]/div/div[1][@class='mask-lt']")),driver);
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id='categories_js']/li[2]//span[2][@class='value']")).click();
        //driver.findElement(By.xpath("//*[@id='categories_js']/li[2]//span[2][contains(text(),'" + car + "')]")).click();
        choosemaker.click();
//        Thread.sleep(5000);
//        home.click();

    }

    public void scroll(WebElement element,WebDriver driver){
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.getText();

    }

    public void onTestStart(ITestContext result) {

    }
}


