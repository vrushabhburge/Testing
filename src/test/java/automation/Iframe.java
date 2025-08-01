package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://v1.training-support.net/selenium/iframes/");
	driver.manage().window().maximize();
	
	//WebElement frame = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
	driver.switchTo().frame(0); // we can use index value also and the iframe index will starts from 0 only
	//3 ways :-frame("indexvalue")
	//frame("id/value")
	//frame("xpath")
	 driver.findElement(By.id("actionButton")).click();
	 driver.switchTo().defaultContent();
	 
	 Thread.sleep(2000);
	 
	 WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
	 driver.switchTo().frame(frame2);
	 driver.findElement(By.id("actionButton")).click();
	 
	 driver.quit();
}
}
