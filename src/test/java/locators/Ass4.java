package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
//	driver.findElement(By.id("alertbtn")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("confirmbtn")).click();
//	Alert al = driver.switchTo().alert();
//	al.accept();
//	//al.dismiss();
//	Thread.sleep(2000);
	WebElement sl = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	 Select s=new Select(sl);
	// s.selectByValue("option2");
	// s.selectByVisibleText("Option3");
	// s.selectByIndex(3);
	 Thread.sleep(2000);
	 driver.quit();
}
}
