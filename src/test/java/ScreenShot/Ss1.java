package ScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\vrush\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\Testing\\ScreenShots\\abc.png");
	source.renameTo(target);
	
	Thread.sleep(2000);
	driver.quit();
}
}
