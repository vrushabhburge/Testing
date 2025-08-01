package FileUplod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uplod1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\vrush\\Downloads\\gaming-room.jpg");
		
		if(driver.findElement(By.id("fileList")).getText().equals("gaming-room.jpg")) {
			System.out.println("File Uploaded");
		}
		else {
			System.out.println("error to upload");
		}
		
		driver.quit();
	}

}
