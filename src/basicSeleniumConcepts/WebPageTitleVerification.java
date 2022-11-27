package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTitleVerification {

	public static void main(String[] args) {
		//launch browser
				WebDriver driver =new ChromeDriver();
				 //navigate to application
				 driver.get("https://www.amazon.com/");
				 //Fetch the Title of the page
				 String actualTitle=driver.getTitle();
				 String expectedTitle="Amazon";
				//Fetch the page source of the web page
				 String pageSource = driver.getPageSource();
				 System.out.println(pageSource);
				 
				 if(actualTitle.contains(expectedTitle)) {
					 System.out.println("Test case Passed");
				 }
				 else
					 System.out.println("Test case is Failed");
				 //close the browser
				 driver.quit();
				 
				 }
	}


