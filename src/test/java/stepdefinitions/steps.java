package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

	@Then("click on selectall check box")
	public void click_on_selectall_check_box() throws InterruptedException {
		//check
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click();
		Thread.sleep(5000);  
		//uncheck
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click();
		Thread.sleep(5000); 
	}

	@Then("click on single checkbox")
	public void click_on_single_checkbox() throws InterruptedException {
		//check
		driver.findElement(By.xpath("//input[@id='subCheckBox1']")).click();
		Thread.sleep(5000);
		//uncheck
		driver.findElement(By.xpath("//input[@id='subCheckBox1']")).click();
		Thread.sleep(5000);

	}


	@Then("click on show entries")
	public void click_on_show_entries() {
		WebElement showentryelement=driver.findElement(By.xpath("//select[@name='dataTable_length']"));
		Select shwentrydrpdown=new Select(showentryelement);
		shwentrydrpdown.selectByIndex(1);
	}


	//@Then("click on updaterole")
	//public void click_on_updaterole() throws InterruptedException {
	//  driver.findElement(By.xpath("//tbody/tr[8]/td[9]/button[1]//*[name()='svg']")).click();
	//	Thread.sleep(5000); 
	//	WebElement updateroleelement=driver.findElement(By.xpath("//select[@id='permissions']"));
	//    Select updateroledrpdown=new Select(updateroleelement);
	//    updateroledrpdown.selectByIndex(3);
	//
	//}

	@Then("click on single delete")
	public void click_on_single_delete() throws InterruptedException {

		driver.findElement(By.xpath("//tbody/tr[3]/td[10]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000);  
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);  

		driver.findElement(By.xpath("//tbody/tr[3]/td[10]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000); 

		driver.switchTo().alert().accept();
		Thread.sleep(5000);  
	}

	@Then("click on update")
	public void click_on_update() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[3]/td[9]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000); 

		WebElement updateelement=driver.findElement(By.xpath("//select[@id='permissions']"));
		Select updatedrpdown=new Select(updateelement);
		updatedrpdown.selectByIndex(1);

		driver.findElement(By.xpath("//div[@id='updateModal']//button[@type='button'][normalize-space()='Save']")).click();
		Thread.sleep(5000); 

	}

	@Then("click on multiple delete")
	public void click_on_multiple_delete() throws InterruptedException {
		driver.findElement(By.id("//input[@id='subCheckBox2']")).click();
		Thread.sleep(5000); 
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("//input[@id='subCheckBox3']")).click();
		Thread.sleep(5000); 
		driver.switchTo().alert().dismiss();

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

	@Then("click on selectall checkbox")
	public void click_on_selectall_checkbox() throws InterruptedException {
		//check
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click();
		Thread.sleep(5000); 

		//uncheck
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click();
		Thread.sleep(5000); 
	}


	@Then("click on settings2")
	public void click_on_settings2() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000);
	}

	@Then("click on designations")
	public void click_on_designations() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Designations']")).click();
		Thread.sleep(5000);  
	}

	@Then("click on add designation {string}")
	public void click_on_add_designation(String string1) throws InterruptedException {
		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='addDesgName']")).sendKeys(string1);
		Thread.sleep(5000);	

		driver.findElement(By.xpath("//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(5000);	

	}

	@Then("click on settings3")
	public void click_on_settings3() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000); 
	}

	@Then("click on permissions")
	public void click_on_permissions() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Permissions']")).click();
		Thread.sleep(5000); 
	}

	@Then("click on add permission {string} and {string}")
	public void click_on_add_permission(String string1, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//input[@id='categoryName']")).sendKeys(string1);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@id='categoryDesc']")).sendKeys(string2);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
	}

	@When("user clicks on settings page")
	public void user_clicks_on_settings_page() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000); 
	}

	@When("clicks on departments from organization")
	public void clicks_on_departments_from_organization() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Departments']")).click();
		Thread.sleep(5000); 
	}

	@Then("clicks on add departments {string} and {string} and {string}")
	public void clicks_on_add_departments(String string1, String string2, String string3) throws InterruptedException {
		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000);   

		driver.findElement(By.xpath("//div[@id='addModal']//input[@placeholder='Department Name']")).sendKeys(string1);
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//ng-select[@id='deptHead']//span[@title='Clear all']")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//ng-select[@id='deptHead']//span[@class='ng-arrow-wrapper']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='Praveen Reddy']")).click(); 
		Thread.sleep(5000);


		driver.findElement(By.xpath("//div[@id='addModal']//input[@id='departmentCode']")).sendKeys(string2);
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//div[@id='addModal']//input[@placeholder='Department Location']")).sendKeys(string3);
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(5000); 

	}
	@Then("when user wants to click single delete")
	public void when_user_wants_to_click_single_delete() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[4]/td[12]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000);  
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);  

		driver.findElement(By.xpath("//tbody/tr[4]/td[12]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000);  
		driver.switchTo().alert().accept();
		Thread.sleep(5000);  


	}

	@When("when user wants to update a department")
	public void when_user_wants_to_update_a_department() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[4]/td[11]/button[1]//*[name()='svg']")).click();
		Thread.sleep(5000);  

		driver.findElement(By.xpath("//ng-select[@id='updateDeptHead']//span[@title='Clear all']")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//ng-select[@id='updateDeptHead']//span[@class='ng-arrow-wrapper']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='Anil Pamarthi']")).click(); 
		Thread.sleep(5000);


		driver.findElement(By.xpath("//div[@id='updateModal']//button[@type='submit'][normalize-space()='Save']")).click(); 
		Thread.sleep(5000);

	}

	@Then("when user clicks on select all checkbox")
	public void when_user_clicks_on_select_all_checkbox() throws InterruptedException {
		//check
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click(); 
		Thread.sleep(5000);  

		//uncheck
		driver.findElement(By.xpath("//input[@id='mainCheckBox']")).click(); 
		Thread.sleep(5000); 
	}

	@Then("when user clicks on single select checkbox")
	public void when_user_clicks_on_single_select_checkbox() throws InterruptedException {
		//check
		driver.findElement(By.xpath("//input[@id='subCheckBox4']")).click(); 
		Thread.sleep(5000); 
		//uncheck
		driver.findElement(By.xpath("//input[@id='subCheckBox4']")).click(); 
		Thread.sleep(5000); 
	}

	@When("user clicks settings page1")
	public void user_clicks_settings_page1() throws InterruptedException {
		driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
		Thread.sleep(5000);  
	}

	@When("user clicks on menu items")
	public void user_clicks_on_menu_items() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Menu Items']")).click();
		Thread.sleep(5000); 
	}

	@Then("clicks on add menu items {string} and {string} and {string}")
	public void clicks_on_add_menu_items(String string1, String string2, String string3) throws InterruptedException {
		driver.findElement(By.xpath("//p[normalize-space()='Add']")).click();
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//input[@id='categoryName']")).sendKeys(string1);
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//input[@id='categoryPath']")).sendKeys(string2);
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//textarea[@id='menuDesc']")).sendKeys(string3);
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//button[@id='saveButton']")).click();
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










