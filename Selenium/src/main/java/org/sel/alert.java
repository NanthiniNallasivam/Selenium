package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/alert");
	
	WebElement s=driver.findElement(By.id("accept"));
	s.click();
	Alert al=driver.switchTo().alert();
	al.accept();
	
	WebElement s1=driver.findElement(By.id("confirm"));
	s1.click();
	Alert co=driver.switchTo().alert();
	String te=co.getText();
	System.out.println(te);
	co.dismiss();
	
	WebElement pr=driver.findElement(By.id("prompt"));
	pr.click();
	Alert pro=driver.switchTo().alert();
	pro.accept();
	
	WebElement advanced=driver.findElement(By.id("modern"));
	advanced.click();
	Alert mo=driver.switchTo().alert();

	WebElement modernte=driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p"));
	String tex=modernte.getText();

}
}
