package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIsDisplayedMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait (Duration. ofSeconds(10));
		WebElement electronics= driver.findElement(By.xpath("//a[.='Electronics']"));

		if(electronics.isDisplayed())
		
				System.out.println("electronics page displayed");
		else
		System.out.println("electronics page is not displayed");

		driver.quit();

	}

}
