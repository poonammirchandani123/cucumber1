package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:src/test/java/feature",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
