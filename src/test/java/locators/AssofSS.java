package locators;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssofSS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
																//Using relative Xpath of Selectors Hub
		
		// WebElement logo = driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset")); 
		// WebElement logo = driver.findElement(By.xpath("//div[@id='radio-btn-example']//fieldset")); 
		 File sou=ts.getScreenshotAs(OutputType.FILE);
		 
		 File fi=new File("C:\\Users\\vrush\\Documents\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\Testing\\ScreenShots\\Full.png");
		 sou.renameTo(fi); //merge both the variables using renameTo() method 
		 driver.quit();
}
}
