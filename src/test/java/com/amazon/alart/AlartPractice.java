package com.amazon.alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement TextBox = driver.findElement(By.name("cusid"));
		TextBox.sendKeys("mahmud");
		WebElement Submit1 = driver.findElement(By.name("submit"));
		Submit1.click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		String AlertMassage = alert.getText();
		System.out.println(AlertMassage);
		
				
		//driver.close();
	
		
		
	//	driver.switchTo().alert().accept();

	}

	
	
}
