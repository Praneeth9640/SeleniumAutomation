package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleTypeSelenium {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver =new ChromeDriver();
		//navigate to application
		driver.get("https://www.google.com/");
		//type search as selenium
		driver.findElement(By.name("q")).sendKeys("Selenium");

	}

}
