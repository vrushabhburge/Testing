package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	WebElement frame1 = driver.findElement(By.id("//div[@class='row']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vrushah");
	
}
}
