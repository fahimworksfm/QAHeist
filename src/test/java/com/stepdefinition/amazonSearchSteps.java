package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.amazonSearchBase;
import com.pageobjectmodel.amazonPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonSearchSteps extends amazonSearchBase{
 
	amazonPages page;
	
	@Given("user on Amazon homepage")
	public void user_on_amazon_homepage() {
	    
	    getDriver();
	    
	    page = PageFactory.initElements(driver, amazonPages.class);
	}

	@When("user clicks on Hello Sign In button")
	public void user_clicks_on_hello_sign_in_button() {
	    
		page.getSignin();
		
	    //driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	}

	@When("user clicks on Create An Amazon Account button")
	public void user_clicks_on_create_an_amazon_account_button() {
	    
		page.getCreateAccBtn();
		
	   // driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	}

	@When("user enters name as {string}")
	public void user_enters_name_as(String name) throws InterruptedException {
	    
	//	Thread.sleep(3000);
		
		page.getNameBx(name);
		
	   // driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(name);
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) throws InterruptedException {
	    
	//	Thread.sleep(3000);
		
		page.getEmailBx(email);
		
	   // driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
	    
		page.getPasswordBx(pass);
		
	   // driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pass);
	}

	@When("user enters repassword as {string}")
	public void user_enters_repassword_as(String repass) {
	    
		page.getRepasswordBx(repass);
		
	   // driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(repass);
	}

	@When("user clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
	    
	//	Thread.sleep(3000);
		
		page.getContinueBtn();
		
	   // driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("user verifies the error message")
	public void user_verifies_the_error_message() {
	    
	    Assert.assertEquals(driver.getTitle(), "Authentication required");
	    
	    getClose();
	}
}
