package com.suraj.qkartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By Username=By.id("username");
	By Password=By.id("password");
	By Loginbtn=By.xpath("//button[text()='Login to QKart']");
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterUsername(String Username) {
		driver.findElement(this.Username).sendKeys(Username);
	}
	public void enterPassword(String Password) {
		driver.findElement(this.Password).sendKeys(Password);
	}
	public HomePage clickLoginBtn() {
		driver.findElement(Loginbtn).click();
		return new HomePage(driver);
	}

}
