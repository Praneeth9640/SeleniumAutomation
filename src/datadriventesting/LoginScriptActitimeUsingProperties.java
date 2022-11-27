package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptActitimeUsingProperties {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("./data.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
        String username = p.getProperty("username");
        String password = p.getProperty("password");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        WebElement logo = driver.findElement(By.id("logo_aT"));
        if(logo.isDisplayed())
        	System.out.println("Pass : login successful");
        else
        	System.out.println("Fail :login failed");
        Thread.sleep(2000);
        driver.quit();
        }

}
