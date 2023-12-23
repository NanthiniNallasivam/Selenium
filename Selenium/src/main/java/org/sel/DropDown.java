package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruits=driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		s.selectByVisibleText("Apple");
		WebElement multiple=driver.findElement(By.id("superheros"));
		Select s1=new Select(multiple);
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		
	
		WebElement country=driver.findElement(By.id("country"));
		Select s3=new Select (country);
		s3.selectByValue("India");
		WebElement name=s3.getFirstSelectedOption();
        String cout=name.getText();
        System.out.println(cout);

	}
}
