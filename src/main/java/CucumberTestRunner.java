import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/main/java/com/qa/features",
        glue = "stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "",
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class CucumberTestRunner{

}
