package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupPractice1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement a=driver.findElement(By.id("course"));
		Actions b = new Actions(driver);
		b.moveToElement(a).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/a[.='Selenium Training']")).click();
		driver.findElement(By.xpath("//button[.=' Add to Cart']")).submit();
		
		
	}

}
