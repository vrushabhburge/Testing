package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Error");
		driver.findElement(By.id("password")).sendKeys("pwd");
		driver.findElement(By.className("radius")).click();
		
	}

}
