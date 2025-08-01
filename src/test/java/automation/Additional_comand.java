package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additional_comand {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.quit();
}
}
