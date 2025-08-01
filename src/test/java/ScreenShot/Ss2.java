package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		 WebElement logo = driver.findElement(By.linkText("Qafox.com"));
		 File sou=logo.getScreenshotAs(OutputType.FILE);
		 
		 File fi=new File("C:\\Users\\vrush\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\Testing\\ScreenShots\\a2.png");
		 sou.renameTo(fi);
		 driver.quit();
}
}
