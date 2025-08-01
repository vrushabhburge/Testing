package KeyMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://v1.training-support.net/selenium/drag-drop");
	driver.manage().window().maximize();
	
	WebElement boll = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	Actions as=new Actions(driver);
	as.dragAndDrop(boll, target).build().perform();
	Thread.sleep(2000);
	
	WebElement target2 = driver.findElement(By.id("dropzone2"));
	Actions as1=new Actions(driver);
	as1.dragAndDrop(boll, target2).build().perform();
	
	Thread.sleep(2000);
	driver.quit();
}
}
