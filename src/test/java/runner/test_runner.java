package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/guru99/guru99.feature"}, glue="definition",tags="@PositiveTesting",plugin= {"html:report/htmlreport.html"})
public class test_runner  {
}