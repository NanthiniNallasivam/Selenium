package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wind {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		String oldwindow=driver.getWindowHandle();
		WebElement ho=driver.findElement(By.id("home"));
		ho.click();

		Set <String> c=driver.getWindowHandles();
		for (String string : c) {
			
		}
		WebElement sw=driver.findElement(By.id("multi"));
		sw.click();
		
		int num=driver.getWindowHandles().size();
		System.out.println(num);
	}

}
