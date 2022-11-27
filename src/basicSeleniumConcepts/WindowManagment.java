package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagment {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver =new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//wait statement
		Thread.sleep(2000);
		//minimize the window
		driver.manage().window().minimize();
		//wait statement
		Thread.sleep(2000);
		//fullscreen the window
		driver.manage().window().fullscreen();
		//wait statement
		Thread.sleep(2000);
		//navigate to the application
		driver.get("https://www.flipkart.com/");
		//wait statement
		Thread.sleep(2000);
		//close the browser
		driver.quit();
		
				
	}

}
