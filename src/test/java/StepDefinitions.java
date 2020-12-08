import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;
import utils.DriverUtils;

public class StepDefinitions
{

   @Before
   public void setUp()
   {
       DriverFactory.getDriver();

   }

   @After
   public void tearDown()
   {
       DriverFactory.closeDriver();
   }



    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)  {
        BasePage.driverUtils.navigateToUrl(url);

    }

    @Then("I should be directed to home page")
    public void i_should_be_directed_to_home_page()
    {
      String homePageTitle =  BasePage.driverUtils.getPageTitle();
        System.out.println(homePageTitle);
    }

    @When("I click on more search options")
    public void i_click_on_more_search_options()
    {
        BasePage.homePage.clickMoreSearchOptionsBtn();
    }

    @When("I enter job title as {string}")
    public void i_enter_job_title_as(String jobTitle)
    {
        BasePage.homePage.enterJobTitle(jobTitle);
    }

    @When("I enter salary min as {string}")
    public void i_enter_salary_min_as(String salMin)
    {
       BasePage.homePage.enterSalaryMin(salMin);
    }

    @When("I enter salary max as {string}")
    public void i_enter_salary_max_as(String salMax)
    {
      BasePage.homePage.enterSalaryMax(salMax);
    }

    @When("I click on find jobs")
    public void i_click_on_find_jobs()
    {
      BasePage.homePage.clickFindJobsBtn();
    }

    @Then("I should see corresponding results for the given details")
    public void i_should_see_corresponding_results_for_the_given_details()
    {
        BasePage.searchResults.getNumberOfResults();
    }






}
