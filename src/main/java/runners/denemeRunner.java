package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature/deneme.feature",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/HtmlReports/HtmlReport.html",
                "json:target/JSonReports/JSonReport.json",
                "junit:target/JUnitReports/JUnitreport.xml"
        }
)
public class denemeRunner {

}
