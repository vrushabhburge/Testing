package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("Vrushabh");
		//driver.findElement(By.id("pass")).sendKeys("12345");
		
		WebElement db = driver.findElement(By.id("email"));
		Actions as1= new Actions(driver);
		as1.contextClick(db).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
