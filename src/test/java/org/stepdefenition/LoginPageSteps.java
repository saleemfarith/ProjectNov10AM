package org.stepdefenition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	public static WebDriver driver;

	@Given("user is in  home page")
	public void user_is_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\GitThirdDay\\Project\\drivers\\chromedriver.exe");
		
       driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
      
	}
	@When("User has to enter username and password and clicking the login button")
	public void user_has_to_enter_username_and_password_and_clicking_the_login_button(io.cucumber.datatable.DataTable dataTable) {
		List<String> a=dataTable.asList(String.class);
		  driver.findElement(By.id("email")).sendKeys(a.get(0));
		  driver.findElement(By.id("pass")).sendKeys(a.get(1));

		  driver.findElement(By.id("loginbutton")).click();

	}

	@Then("user should naviagted to the login page")
	public void user_should_naviagted_to_the_login_page() {
		System.out.println("Login page is verified");
	   driver.close();
	}


}
