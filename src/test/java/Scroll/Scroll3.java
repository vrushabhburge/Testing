package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//Scrolling By Pixcels
		//js.executeScript("window.scrollBy(0,1000)","" );
		
		//Scrolling By y axis or verticle
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)","");
		
		//Scrolling till the perticulr web Element
		WebElement idscroll = driver.findElement(By.xpath("//legend[normalize-space()='Web Table Example']"));
		js.executeScript("arguments[0].scrollIntoView();",idscroll );
		
	}

}
