package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sychronition {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	/*Synchronization:- When automation script does not match application
	speed, we come across synchronization issue.
	*To over come this issue we use Thread.sleep() method to load the 
	*We can enconter these using selenium command, 1.implicit wait/2.Explicit wait 
	*
	*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //it saves the time 
	
	//Thread.sleep(5000); //its tempory solution and its not selinium command and its take more time thn other selenium command
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
