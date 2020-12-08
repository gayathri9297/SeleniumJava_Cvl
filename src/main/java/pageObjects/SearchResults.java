package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResults
{



    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "p.search-header__results")
    public WebElement searchResults;



    public SearchResults(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }



   public void getNumberOfResults()
   {

       wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOf(searchResults));

       System.out.println("Number of  results for given role are: " + searchResults.getText());

   }





}
