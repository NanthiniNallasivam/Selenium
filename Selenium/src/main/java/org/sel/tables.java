package org.sel;

import java.net.Socket;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://letcode.in/table");
	
	
	WebElement counts=driver.findElement(By.id("shopping"));
	List<WebElement> l=counts.findElements(By.tagName("th"));
	for (WebElement webElement : l) {
		String te=webElement.getText();
		System.out.println(te);
	}
	List<WebElement> rows=driver.findElements(By.cssSelector("tbody tr"));
	int si=rows.size();
	System.out.println(si);
	if (si==7) {
		System.out.println("pass");
	} else {
		System.out.println("fail");

	}
	for (WebElement web : rows) {
		List <WebElement> p=web.findElements(By.tagName("td"));
		WebElement c=p.get(0);	
		System.out.println(c.getText());}
}
}
