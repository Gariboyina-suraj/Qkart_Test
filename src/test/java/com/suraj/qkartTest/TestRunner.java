package com.suraj.qkartTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestRunner {

	@Test
	public void FirstTest(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suraj G/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
		RegisterPage r=new RegisterPage(driver);
		String Lastusername="suraj"+java.time.LocalDateTime.now();
		r.enterUsername(Lastusername);
		r.enterPassword("suraj123");
		r.confirmPassword("suraj123");
		LoginPage l=r.clickRegisterBtn();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("login"));
		l.enterUsername(Lastusername);
		l.enterPassword("suraj123");
		HomePage h=l.clickLoginBtn();
		h.Search("Shoes");
		h.AddtoKart();
		h.Checkout();
		
		
		

	}

	

}
