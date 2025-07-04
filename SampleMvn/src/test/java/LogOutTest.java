import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
	
	public void logout() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
			driver.get("https://www.saucedemo.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//max time out
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		     
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			driver.quit();

		
	}

	public static void main(String[] args) throws InterruptedException {
		
	}

}
