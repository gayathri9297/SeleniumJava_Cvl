package utils;

import org.openqa.selenium.WebDriver;

public class DriverUtils
{

    public  void navigateToUrl(String url)
    {
      DriverFactory.driver.navigate().to(url);
    }

    public  void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }

    public  String getPageTitle()
    {
        return DriverFactory.driver.getTitle();

    }
}
