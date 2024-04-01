package stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps {
	WebDriver driver;

	@Given("user open the URL {string}")
	public void user_open_the_url(String string) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PraveenReddyGurram\\eclipse-workspace\\seleniummavenjava\\cheomedriver-win64\\chromedriver.exe");		driver=new ChromeDriver();
		//UMS URL 
		driver.get(string);
		driver.manage().window().maximize();
	}

	@Then("User enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) throws InterruptedException {
		//email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
		Thread.sleep(3000);
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		Thread.sleep(3000);

	}

	@Then("User enter the submit button")
	public void user_enter_the_submit_button() throws InterruptedException {
		//login
		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(5000);
	}
	
	@Then("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='logoutRef']")).click();
		Thread.sleep(5000);
	   
	}

}










