package pageObjects;

import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage
{
    public static HomePage homePage;
    public static SearchResults searchResults;
    public static DriverUtils driverUtils;

    public static void initPages()
    {
        homePage = new HomePage(DriverFactory.driver);
        searchResults = new SearchResults(DriverFactory.driver);
        driverUtils = new DriverUtils();

    }


}
