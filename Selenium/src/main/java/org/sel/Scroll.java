package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/edit");
	driver.manage().window().maximize();
	
	JavascriptExecutor s=(JavascriptExecutor)driver;
	s.executeScript("window.scrollBy(0,100)");
	
	WebElement t=driver.findElement(By.id("clearMe"));
	s.executeScript("arguments[0].scrollIntoView();",t);
	
	s.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	
}
}
