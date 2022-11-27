package pomPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 ActitimeLoginPage google =new ActitimeLoginPage(driver);
		google.sendkeysusernameTextField("admin");
		google.sendkeyspasswordTextField("manager");
		google.loginclickButton();
		Thread.sleep(6000);
		
		if(driver.getTitle().contains("actiTIME -  Enter Time-Track"))
		System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.quit();
		
	}

}
