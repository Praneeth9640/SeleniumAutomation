package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIsSelectedMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display-page");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Radiobutton = driver.findElement(By.xpath("//input[@name='sex']"));
		if(Radiobutton.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		driver.quit();
	}

}
