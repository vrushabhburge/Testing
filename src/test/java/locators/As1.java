package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/login.html");
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='email']")).sendKeys("vrushabh");
	d.findElement(By.xpath("//input[@name='passwd']")).sendKeys("1234");
	
	//d.findElement(By.linkText("Forgot your password?")).click();
	//d.findElement(By.partialLinkText("Forgot ")).click();
	
}
}
