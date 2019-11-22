package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;

public abstract class ScriptBase {
    public WebDriver driver;
    public void init(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
       this.driver= new ChromeDriver();
       this.driver.get("https://www.car.com/");

    }

    public abstract void onTestStart(ITestContext result);
}


