package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement boll = driver.findElement(By.id("draggable"));
	WebElement target2 = driver.findElement(By.id("droppable"));
	Actions as1=new Actions(driver);
	as1.dragAndDrop(boll, target2).build().perform();
	
	Thread.sleep(2000);
	driver.quit();
	
}
}
