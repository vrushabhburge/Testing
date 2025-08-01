package SwitchWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroko {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	
	Set<String> allids = driver.getWindowHandles();
	
	List<String> ids=new ArrayList(allids);
	String paresentwindow=ids.get(0);
	String childwindow=ids.get(1);
	
	driver.switchTo().window(childwindow);
	
	
	driver.findElement(By.linkText("Tips")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
