package webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimensionsFlipkartMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		WebElement searchTextField =driver.findElement(By.xpath("//img[@alt='APPLE iPhone 11 (White, 128 GB)']"));
		Dimension size = searchTextField.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Height of the element : "+height);
		System.out.println("Width of the element : "+width);
		driver.quit();
		
		
		
	}

}
