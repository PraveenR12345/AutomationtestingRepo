package login.UMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginums {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();


		//UMS URL
		driver.get("http://localhost:4200/#/login");
		driver.manage().window().maximize();
		//email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveenreddy.g@ikcontech.com");
		Thread.sleep(3000);
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		Thread.sleep(3000);
		//login
		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(4000);



	}


}
