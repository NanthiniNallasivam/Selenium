package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/dropable");
	
	WebElement start=driver.findElement(By.id("text"));
	WebElement end=driver.findElement(By.id("droppable"));
	
	Actions s=new Actions(driver);
	s.clickAndHold(start).moveToElement(end).perform();
	
	}

}
