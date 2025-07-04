import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUserLogin {
	
	
	public void login(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
		driver.get("https://www.saucedemo.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(username+" -> Login Successful");
		}
		catch(Exception e) 
		{
			//String errorMsg=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			//System.out.println(errorMsg);
			System.out.println(username+ "- >Login Failed");
			
			
		}
		
		driver.quit();
	}
	

	public static void main(String[] args) {
		MultiUserLogin mul= new MultiUserLogin();
		mul.login("standard_user", "secret_sauce");
		mul.login("locked_out_user", "secret_sauce");
		mul.login("problem_user", "secret_sauce");
		mul.login("performance_glitch_user", "secret_sauce");
		mul.login("error_user", "secret_sauce");
		mul.login("visual_user", "secret_sauce");
		

	}

}
