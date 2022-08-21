package StepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage extends ProjectSpecificMethods{

	

	@Given("Type the username as {string}")
	public void typeusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@And("Type the password as {string}")
	public void typepassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click Login Button")
	public void clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Verify the Homepage is displayed")
	public void verifyHomepage() {
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("welcome")) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
	}

	@But("Error messsge is shown")
	public void verifyErrorMessage() {
		System.out.println("ErrorMessage");

	}



}
