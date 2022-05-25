package com.amazon.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	WebDriver driver;

	@Given("I am on Amazon homepage")
	public void i_am_on_amazon_homepage() {

		WebDriverManager.chromedriver().setup(); // set property
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {

		WebElement searchBox;
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(string);
	
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		WebElement searchBtn;
		searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();

	}

	@Then("I received related search result")
	public void i_received_related_search_result() {
		WebElement resultStats;
		resultStats = driver.findElement(By.className("sg-col-inner"));
		String results = resultStats.getText();

		System.out.println("====================");
		System.out.println(results);
		System.out.println("====================");

		driver.close();

	}

}
