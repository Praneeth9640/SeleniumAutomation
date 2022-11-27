package basicSeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApp {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./chromedriver.exe";
		System.setProperty(key,value);
		 //launch browser
		WebDriver driver =new ChromeDriver();
		 //navigate to application
		 driver.get("https://www.google.com/");
		 //Fetch the title of the application
		 String title=driver.getTitle();
		 System.out.println(title);
		 //fetch the url of current application
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 //close the application
		 driver.close();
		 
		 

	}

}
