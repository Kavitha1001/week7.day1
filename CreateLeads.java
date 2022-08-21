package StepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeads extends ProjectSpecificMethods{


	@Given ("click on CRMSFA link")
	public void clickcrmsfalink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@And ("click on Leads link")
	public void clickleadslink() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@And ("click on Create Leads Link")
	public void clickcreateleads() {
		driver.findElement(By.linkText("Create Lead")).click();
	}


	@When ("Type companyname as (.*)$")
	public void typecompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And ("Type the firstname as (.*)$")
	public void typefirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And ("Type the lastname as (.*)$")
	public void typelastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@And ("click on Create Lead Button")
	public void clickcreateleadbutton() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}

