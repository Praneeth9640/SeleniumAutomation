package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait (Duration. ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//img[@class='img-fluid navbar-brand-img']"));

		if(logo.isDisplayed())
		
				System.out.println("Login page displayed");
		else
		System.out.println("Login page is not displayed");

		driver.quit();

	}

}
