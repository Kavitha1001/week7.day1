package runner;


import StepDefs.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
                  glue="StepDefs",
                 monochrome=true,
                  publish=true  )
public class RunCucumberTests extends ProjectSpecificMethods {

}
