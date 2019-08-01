package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	WebDriver dr;
	
	@Given("^Application up and running$")
	public void anncation_up_and_running() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\SE_26052019\\Drivers\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");

		//System.out.println("Application up and running");
	}

	@When("^I entre valid credentials$")
	public void i_enre_valid_credentials() {

		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		//System.out.println("I enter valid credentials");
	}

	@Then("^Flight Finder page is displayed$")
	public void flight_Finder_page_is_displayed() {
	
		System.out.println("Flight Finder page is displayed");
	}

}
