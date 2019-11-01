package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchPage extends ScriptBase {

    @FindBy(id="research_st")
    WebElement research;

    public ResearchPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void research(WebDriver driver)throws InterruptedException{


        research.click();
}
}
