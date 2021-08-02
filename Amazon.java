package Amazon;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selinium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div/div[1]/div/span[3]/div[2]/div[2]")).click();
		for(String child : driver.getWindowHandles()) {
			
			driver.switchTo().window(child);
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		

	}
}