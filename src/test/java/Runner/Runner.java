package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/feature/", glue = "Steps", tags = "@tagaberturadeconta", 
plugin = { "pretty", "html:target/flashcode.html"}, monochrome = true, dryRun = false)

public class Runner {
	


}