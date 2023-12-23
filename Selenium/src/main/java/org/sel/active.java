package org.sel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class active {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement s=driver.switchTo().activeElement();
	s.sendKeys("kavi"+Keys.TAB,"password"+Keys.ENTER);
	
}
}
