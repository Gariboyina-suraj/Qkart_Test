package com.suraj.qkartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	By Username=By.id("username");
	By Password=By.id("password");
	By Confirm=By.id("confirmPassword");
	By Registerbtn=By.xpath("//button[text()='Register Now']");
	
	RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	public void enterUsername(String Username) {
		driver.findElement(this.Username).sendKeys(Username);
	}
	public void enterPassword(String Password) {
		driver.findElement(this.Password).sendKeys(Password);
	}
	public void confirmPassword(String Password) {
		driver.findElement(Confirm).sendKeys(Password);
	}
	public LoginPage clickRegisterBtn() {
		driver.findElement(Registerbtn).click();
		return new LoginPage(driver);
	}

}
