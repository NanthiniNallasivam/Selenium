package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		WebElement name=driver.findElement(By.id("fullName"));
		name.sendKeys("nanthini");
		
		WebElement appnd=driver.findElement(By.id("join"));
		appnd.sendKeys(" girl");
		
		WebElement gettext=driver.findElement(By.id("getMe"));
		String text=gettext.getAttribute("value");
		System.out.println(text);
		
		WebElement clear=driver.findElement(By.id("clearMe"));
		clear.clear();
		
		WebElement disabled=driver.findElement(By.id("noEdit"));
		Boolean disable=disabled.isEnabled();
		System.out.println("is this enabled:"+disable);
		
		WebElement readOnly=driver.findElement(By.id("dontwrite"));
		String te=readOnly.getAttribute("value");
		System.out.println(te);
		
		
		
		
		
		
		}

}
