package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	  WebElement tooltip=driver.findElement(By.id("toolTipTextField")); 
	  String te=tooltip.getAttribute("Tittle"); 
	  System.out.println(te);
	  
	  
	 
	 
	
	
	
	
}
}
