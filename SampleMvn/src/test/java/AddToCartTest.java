import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
	
	public void addcart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
			driver.get("https://www.saucedemo.com");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			String price=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
			System.out.println(price);
			driver.quit();
		
	}

	public static void main(String[] args) {
		
	}

}
