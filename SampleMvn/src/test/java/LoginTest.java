import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
		driver.get("https://www.saucedemo.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Successful");
		}
		catch(Exception e) 
		{
			String errorMsg=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(errorMsg);
			System.out.println("Login Failed");
			
			
		}
		
		driver.quit();
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		
}
	}
