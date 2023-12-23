package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mousehove {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	WebElement j=driver.findElement(By.xpath("/html/body/div[3]/div/span"));
	j.click();
	
	WebElement o=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[3]"));
	o.click();
	
	
	
}
}
