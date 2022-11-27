package loginScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebDriverWait wait = new WebDriverWait(driver, Duration. ofSeconds(10));
		
	
		wait.until (ExpectedConditions. titleContains("actiTIME Login"));

		WebElement loginTextField = driver.findElement(By.name("username"));
		wait.until (ExpectedConditions.visibilityOf(loginTextField)).sendKeys("admin");
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		wait.until(ExpectedConditions. visibilityOf(passwordTextField)).sendKeys("manager");

		WebElement loginButton = driver.findElement(By.xpath("//div[.='-Login']"));

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}

}
