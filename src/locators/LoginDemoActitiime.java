package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoActitiime {

		public static void main(String[] args) throws InterruptedException{
		//launch browser
		WebDriver driver =new ChromeDriver();
		//navigate to application
		driver.get("https://demo.actitime.com/login.do");
		//Enter the username
		 driver.findElement(By.id("username")).sendKeys("admin");
		 //Enter the Password
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 //wait statement
		 Thread.sleep(5000);
		 //close the browser
		 driver.quit();
	}

}
