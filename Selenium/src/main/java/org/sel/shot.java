package org.sel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		
		TakesScreenshot s=((TakesScreenshot)driver);
		File F=s.getScreenshotAs(OutputType.FILE);
		
		File des= new File("./snap/img.png");
		
        FileHandler.copy(F, des);
		driver.quit();
		
		
	}

}
