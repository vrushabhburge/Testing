package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement ele = driver.findElement(By.id("country"));
	Select s= new Select(ele);
	s.selectByIndex(0);
	//s.selectByValue("usa");
	//s.selectByVisibleText("Japan");;
	//s.deselectByValue(null);
	Thread.sleep(2000);
	driver.quit();
}
}
