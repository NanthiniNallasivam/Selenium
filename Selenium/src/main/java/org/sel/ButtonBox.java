package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonBox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/buttons");
	driver.manage().window().maximize();
	WebElement home=driver.findElement(By.id("home"));
	home.click();
	driver.navigate().back();
	WebElement location=driver.findElement(By.id("position"));
	Point xylocation=location.getLocation();
	int xvalue=xylocation.getX();
	int yvalue=xylocation.getY();
	System.out.println("x value is:"+xvalue+"\n y value is:"+yvalue);
	
	WebElement color=driver.findElement(By.id("color"));
	String co=color.getCssValue("background-color");
	System.out.println("colour is:"+co);
	
	WebElement size=driver.findElement(By.id("property"));
	int heightOfBox=size.getSize().getHeight();
	int widthOfBox=size.getSize().getWidth();
	System.out.println("height is:"+heightOfBox+"width is"+widthOfBox);
	
	WebElement disabled=driver.findElement(By.id("isDisabled"));
	Boolean enabled=disabled.isEnabled();
	System.out.println("is this enabled"+enabled);
	
	WebElement hold=driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
	new Actions(driver).clickAndHold(hold).perform();

	
}
}
