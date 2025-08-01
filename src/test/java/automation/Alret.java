package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alret {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	
//	driver.findElement(By.xpath("//button[text()='Click me' and @id='alertBox']")).click();
//	Alert al = driver.switchTo().alert();
//	Thread.sleep(2000);
//	al.accept();
//	
//	
//	driver.findElement(By.id("confirmBox")).click();
//	Alert al1 = driver.switchTo().alert();
//	Thread.sleep(2000);
//	al1.dismiss();
//	Thread.sleep(2000);
	
	driver.findElement(By.id("promptBox")).click();
	Alert al2 = driver.switchTo().alert();
	al2.sendKeys("vrushabh");
	Thread.sleep(2000);
	al2.accept();
	Thread.sleep(2000);
	
	
	Thread.sleep(2000);
	
	WebElement res = driver.findElement(By.id("output"));
	System.out.println(res.getText());
}
}
