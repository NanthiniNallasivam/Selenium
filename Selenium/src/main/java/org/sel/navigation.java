package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/dropdowns");

driver.navigate().refresh();
driver.navigate().back();
driver.navigate().forward();


}
}
