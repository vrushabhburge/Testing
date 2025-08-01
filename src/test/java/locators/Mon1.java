package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mon1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");//lonch link web
//	d.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	d.manage().window().maximize();// to maximize the window
	Thread.sleep(2000);// wait for some sec
	
	//d.findElement(By.partialLinkText("Password")).click(); // we can pass partial value 
	//d.findElement(By.linkText("Forgotten Password")).click();//Mainly used it used bcz of duplication not entreten
	
	/*Xpath :-
	Syntax:-
	tagname[@attribute='value'] or tagname[text()='value']
	*1.Absolute Xpath 
	 * 2.Reletive Xpath
	 */
//d.findElement(By.xpath(""));
//	d.findElement(By.xpath("")).click();
	d.findElement(By.xpath("//input[@id='email']")).sendKeys("vru@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
}
}
