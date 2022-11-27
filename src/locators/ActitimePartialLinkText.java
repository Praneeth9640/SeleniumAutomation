package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver =new ChromeDriver();
		//navigate to application
		driver.get("https://demo.actitime.com/login.do");
		//click on forgotten password
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		//wait statement
		 Thread.sleep(5000);
		//return to login page
		driver.findElement(By.partialLinkText("Return")).click();
		driver.quit();
		
	}

}
