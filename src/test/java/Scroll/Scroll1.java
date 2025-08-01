package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)","" );
	
	//2.Scrolling till end of the page and top of the page.
	//js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
	
	//Thread.sleep(2000);
	
	//3.Scrolling till the Web element
	WebElement mac=driver.findElement(By.linkText("MacBook"));
	js.executeScript("arguments[0].scrollIntoView();", mac);
}
}
