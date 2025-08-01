package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoCheck {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	WebElement check = driver.findElement(By.linkText("Qafox.com"));
	System.out.println(check.isDisplayed());
	
}
}
