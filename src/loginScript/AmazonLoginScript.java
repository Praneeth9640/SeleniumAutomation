package loginScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginScript {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String loginPageTitle = driver.getTitle();
		if(loginPageTitle.equals("Amazon"))
			System.out.println("Pass : Login page displayed");
		else
			System.out.println("Fail : Login page is not displayed");
		driver.findElement(By.partialLinkText("Hello, sign in")).click();
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9640795884");
		//driver.findElement(By.name("email")).sendKeys("554548");

	}

}
