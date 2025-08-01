package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SsOfMultipleelt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
																//Using relative Xpath of Selectors Hub
		 WebElement logo = driver.findElement(By.xpath("//img[@title='MacBook']")); 
		 File sou=logo.getScreenshotAs(OutputType.FILE);
		 
		 File fi=new File("C:\\Users\\vrush\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\Testing\\ScreenShots\\mac.png");
		 sou.renameTo(fi); //merge both the variables using renameTo() method 
		 driver.quit();
}
}
