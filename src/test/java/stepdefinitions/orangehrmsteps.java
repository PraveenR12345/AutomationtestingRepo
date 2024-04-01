package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmsteps {
	WebDriver driver;


	@Given("user is on login page {string}")
	public void user_is_on_login_page(String string) {
		WebDriverManager.chromedriver().setup();		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PraveenReddyGurram\\eclipse-workspace\\seleniummavenjava\\cheomedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String string1,String string2) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(string1);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(string2);
		Thread.sleep(3000);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
Thread.sleep(3000);
	}

	@Then("click on admin from side menu bar")
	public void click_on_admin_from_side_menu_bar() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		Thread.sleep(3000);
	}


	@Then("click on add in admin page user management")
	public void click_on_add_in_admin_page_user_management() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(3000);
	}

//	@Then("click on job dropdown in admin page")
//	public void click_on_job_dropdown_in_admin_page() throws InterruptedException {
//		driver.findElement(By.xpath("//span[normalize-space()='Job']//i[@class='oxd-icon bi-chevron-down']")).click();
//		WebElement job=
//		Thread.sleep(3000);
//	}
}
