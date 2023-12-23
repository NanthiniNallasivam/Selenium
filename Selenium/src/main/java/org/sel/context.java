package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	/* driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); */
	
	WebElement s1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Actions s=new Actions(driver);
	s.contextClick().perform();
		
}
}
