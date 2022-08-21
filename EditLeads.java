package StepDefs;


import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditLeads extends ProjectSpecificMethods {
     
    
    
	@Given ("click on CRM link")
	public void clickcrmlink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And ("click  Leads link")
	public void leadslink() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("click on Find Leads link")
	public void findleadslink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And ("Type firstname as (.*)$")
	public void typefname(String fName) {
		driver.findElement(By.xpath("//div[@class='x-form-element']/following::input[@name='firstName'][3]")).sendKeys(fName);
	}
	@And ("Click Find leads button")
	public void clickfindleads()  {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	}
	@And ("Click Firstresulting link")
	public void firstresult() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1]")).click();
		
	}
	@Then("sleep 5 secs")
	public void Sleep() throws InterruptedException {
		Thread.sleep(5000);
		
	}
			
	@Then ("verify the title of the page")
	public void verifypage() {
		System.out.println("The Title of the page is:"+driver.getTitle());
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Verfied the title");
		}else
			System.out.println("The title of the page is not View Lead");
	}
	@And ("click Edit link")
	public void clickedit() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@And ("Change the company name (.*)$")
	public void changecompanyname(String ComName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(ComName);
	}
	@And ("click Update button")
	public void clickupdate() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then ("Confirm the changed name appears")
	public void confirmchangename() {
		boolean displayed=driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		System.out.println(displayed);
	}

}
