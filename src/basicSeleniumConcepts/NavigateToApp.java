package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApp {

	public static void main(String[] args) throws InterruptedException{
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Navigate to facebook application
		driver.get("https://www.facebook.com/");

		//Navigate to netflix from facebook
		driver.navigate().to("https://www.netflix.com/in/");
		//Navigate to voot application

		driver.navigate().to("https://www.voot.com/");

		//Navigate to Instagram application
		driver.navigate().to("https://www.instagram.com/");

		//Navigate back
		driver.navigate().back();
		//navigate forward
		driver.navigate().forward();
		//wait statement
		Thread.sleep(2000);
		//refresh the current page
		driver.navigate().refresh();
		//close the browser
				driver.quit();
		}
}
