import Linearframework.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:output"},
        tags={"@Smoke2"},
        features="src/test/resources/signin1"
)


public class Runtest extends Hooks {

}
