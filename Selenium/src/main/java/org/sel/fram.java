package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");


		driver.switchTo().frame(0);
		WebElement d=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
		d.sendKeys("ananthi"); 
		WebElement e=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
		e.sendKeys("mailmenanthini@gmai");
		driver.switchTo().frame(1);

		WebElement er=driver.findElement(By.xpath(
				"/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
		er.sendKeys("mailmenanthini@gmail.com");

		driver.switchTo().parentFrame();
		WebElement f=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
		f.sendKeys("@gmail.com");

		driver.switchTo().defaultContent();
		WebElement g=driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"));
		g.click();

	}
}
