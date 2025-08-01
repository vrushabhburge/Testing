package SwitchWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> allids = driver.getWindowHandles();
		
		List<String> ids=new ArrayList(allids);
		
		String paresentwindow=ids.get(0);
		String childwindow=ids.get(1);
		
		driver.switchTo().window(childwindow);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().window(paresentwindow);
		
	String tit=driver.getTitle();
	System.out.println(tit);
		driver.quit();
		
	}

}
