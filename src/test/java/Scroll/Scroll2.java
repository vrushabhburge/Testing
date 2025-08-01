package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	//Scroll Till Element
   WebElement btn = driver.findElement(By.className("vl-popular-destinations-evo__name"));
	js.executeScript("arguments[0].scrollIntoView();",btn);
	
	//js.executeScript("window.scrollBy(0,1000)","" );
	
	//js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
	Thread.sleep(2000);
	driver.quit();
}
}
