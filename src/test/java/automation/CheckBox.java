package automation;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		d.findElement(By.id("name")).sendKeys("vrushabh");
//		Thread.sleep(2000);
////		 d.findElement(By.id("sunday")).click();
//		 Thread.sleep(2000);
//		 d.findElement(By.id("male")).click();
//		 Thread.sleep(2000);
//		d.quit();
//		Thread.sleep(3000);
		 java.util.List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
//		for(int i=0; i<=check.size()-1;i++) {
//			check.get(i).click(); //Simply clicking all check box
//		}
//		Thread.sleep(2000); 
//		for(int i=0; i<=check.size()-1;i++) {
//			check.get(i).click();
//		}
//		 for(int i=check.size()-1;i>3;i--) {
//			 check.get(i).click(); //To click the last 4 check box 
//		 }
		 
		Thread.sleep(2000);
		driver.quit();
	}

}
