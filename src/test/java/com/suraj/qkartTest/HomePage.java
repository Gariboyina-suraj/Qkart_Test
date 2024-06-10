package com.suraj.qkartTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	By searchinput=By.xpath("(//input[@name='search'])[1]");
	By search=By.xpath("//div[contains(@class,'css-11zsshc')]/div/*[local-name()='svg' and @data-testid='SearchIcon']");
	By productNames=By.xpath("//div[contains(@class,'css-sycj1h')]/div/div/p[1]");
	By addToKart=By.xpath("//button[text()='Add to cart']");
	By checkOutBtn=By.xpath("//button[text()='Checkout']");
	HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void Search(String searchItem) {
		driver.findElement(searchinput).sendKeys(searchItem);
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.textToBePresentInElementLocated(productNames, searchItem));
		List<WebElement> Products=driver.findElements(productNames);
		for(WebElement w:Products) {
			if (w.getText().contains(searchItem)) {
				System.out.println(w.getText());
				System.out.println("Search test is passed");
			}else {
				System.out.println(w.getText());
				System.out.println("Search test is failed");
			}
		}
		
		
	}
	public void AddtoKart() {
		driver.findElement(addToKart).click();
		
	}
	public void Checkout() {
		driver.findElement(checkOutBtn).click();
	}

}
