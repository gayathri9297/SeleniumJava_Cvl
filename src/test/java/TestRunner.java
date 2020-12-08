import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "features/JobSearch.feature",

        // glue = {"stepDefinitions"},
        plugin = {"pretty:target/test.html"},

         monochrome = true,

         dryRun = true



)


@RunWith(Cucumber.class)
public class TestRunner
{

}
