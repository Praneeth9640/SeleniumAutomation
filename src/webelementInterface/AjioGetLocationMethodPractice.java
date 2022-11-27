package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioGetLocationMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/shop/kids']")).click();
		
		WebElement ajio = driver.findElement(By.xpath("//a[@href='/s/0-to-2-years-3767-54091']"));
		Point location = ajio.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x coordinate : "+x+"\n"+"y coordinate : "+y);
		driver.quit();

	}

}
