package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class HomePage
{
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "toggle-hp-search")
    public WebElement moreSearchOptionsBtn;


    @FindBy(id = "keywords")
    public WebElement jobTitleTextBox;



    @FindBy(id = "salarymin")
    public WebElement salaryMinTextBox;

    @FindBy(id = "salarymax")
    public WebElement salaryMaxTextBox;

    @FindBy(id = "hp-search-btn")
    public WebElement findJobsBtn;



    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }




    public void clickMoreSearchOptionsBtn()
    {
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(moreSearchOptionsBtn));
        moreSearchOptionsBtn.click();
    }

    public void enterJobTitle(String jobTitle)
    {
        jobTitleTextBox.sendKeys(jobTitle);
    }

    public void enterSalaryMin(String salMin)
    {
        salaryMinTextBox.sendKeys(salMin);
    }

    public void enterSalaryMax(String salMax)
    {
        salaryMaxTextBox.sendKeys(salMax);
    }


    public void clickFindJobsBtn()
    {
        wait  = new WebDriverWait(driver,25);
        wait.until(ExpectedConditions.visibilityOf(findJobsBtn));
        findJobsBtn.click();
    }





















}
