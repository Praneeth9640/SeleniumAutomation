package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorPractice {

	public static void main(String[] args) throws InterruptedException{
		//launch browser
		WebDriver driver =new ChromeDriver();
		//navigate to application
		 driver.get("https://www.facebook.com/");
		//Enter the username
		 driver.findElement(By.id("email")).sendKeys("admin");
		 //Enter the Password
		 driver.findElement(By.id("pass")).sendKeys("1234");
		 //click on login button
		 driver.findElement(By.name("login")).click();
		 //wait statement
		 Thread.sleep(5000);
		 //close the browser
		 driver.quit();

	}

}
