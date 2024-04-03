package stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class steps {
	WebDriver driver;

	@Given("user open the URL {string}")
	public void user_open_the_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PraveenReddyGurram\\eclipse-workspace\\seleniummavenjava\\cheomedriver-win64\\chromedriver.exe");		
		driver=new ChromeDriver();
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
		Thread.sleep(7000);
	}

	@Then("click on settings")
	public void click_on_settings() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000);

	}
	@Then("click on roles")
	public void click_on_roles() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Roles']")).click();
		Thread.sleep(5000);  
	}

	@Then("click on add role {string} and {string}")
	public void click_on_add_role_and(String string1, String string2) throws InterruptedException {

		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000);  

		driver.findElement(By.xpath("//input[@id='addRoleName']")).sendKeys(string1);
		Thread.sleep(5000); 

		WebElement roleelement=driver.findElement(By.xpath("//select[@id='addPermissions']"));
		Select permissiondrpdown=new Select(roleelement);
		permissiondrpdown.selectByVisibleText(string2);
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//div[@id='createModal']//button[@type='button'][normalize-space()='Save']")).click();
		Thread.sleep(5000); 


	}
	@Then("click on settings1")
	public void click_on_settings1() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000);
	}
	
	@Then("click on task category")
	public void click_on_task_category() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Task Category']")).click();
		Thread.sleep(5000);

	}

	@Then("click on add task category {string} and {string}")
	public void click_on_add_task_category(String string1, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='categoryName']")).sendKeys(string1);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//textarea[@id='categoryDesc']")).sendKeys(string2);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
	}

	@Then("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[@class='header-pic']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='logoutRef']")).click();
		Thread.sleep(5000);

	}

}










