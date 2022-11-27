package pomPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pomPages.GooglePage;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GooglePage google =new GooglePage(driver);
		Thread.sleep(2000);
		google.getSearchTextField().sendKeys("phone");
		driver.quit();
		
	}

}
