package SwitchWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	 driver.findElement(By.xpath("//a[@id='opentab']")).click();
	Set<String> allids=driver.getWindowHandles();
	List<String> ids=new ArrayList<>(allids);
	
	String paresentwindow=ids.get(0);
	String childwindow=ids.get(1);
	driver.switchTo().window(childwindow);
	
	driver.findElement(By.linkText("Courses")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
