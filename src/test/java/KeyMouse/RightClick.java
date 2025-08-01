package KeyMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
//		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions as= new Actions(driver);
//		as.contextClick().build().perform(); // to perform rightclick 
//		Thread.sleep(2000);
		
		//Double Click
		WebElement db = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions as1= new Actions(driver);
		as1.doubleClick(db).build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
