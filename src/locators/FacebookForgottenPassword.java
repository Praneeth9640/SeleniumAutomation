package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgottenPassword {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver =new ChromeDriver();
		//navigate to application
		driver.get("https://www.facebook.com/");
		//click on forgotten password
		driver.findElement(By.linkText("Forgotten password?")).click();
        driver.quit();
	}

}
