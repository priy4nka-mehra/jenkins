package org.ttn.MavenF;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
	
		import org.testng.annotations.Test;

	public class OrangeAutomation {
		
		public static WebDriver driver;
		@BeforeClass
		  public void Launch() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka Mehra"
					+ "\\Downloads\\chromedriver_win32\\chromedriver.exe");

			 driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opens	ource-demo.orangehrmlive.com/web/index.php/auth/login");
			  
			  Thread.sleep(5000);
			  
			  
		  }
	  @Test(priority=0)
	  public void landingPage() {
		  
		  if(driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed() != true)
			  System.out.println("Login Page not Load");
		   
	  }
	  
	  @Test(priority=1)
	  public void Login() {
		  if(driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).isDisplayed() == true) {
			  driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
			  if(driver.findElement(By.xpath("//input[@name='password']")).isDisplayed() == true)
				  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			  else
				  System.out.println("Password field is not displayed");
		  }
			  
		  else
			  System.out.println("Username is not displayed"); 
	  }
	  
	  @Test(priority=2)
	  public void submit() throws InterruptedException {
		  WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		  if(btn.isEnabled()==true)
			  btn.click();
		  else
			  System.out.println("Button is not enabled");
		  
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority=3) 
	  public void adminOption() throws InterruptedException {
		  WebElement btn = driver.findElement(By.xpath("//span[text()=\"Admin\"]"));
		  if(btn.isEnabled()==true)
			  btn.click();
		  else
			  System.out.println("Button is not enabled");
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority=4)

	  public void addButton() throws InterruptedException {
		  WebElement btn = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
		  if(btn.isEnabled()==true)
			  btn.click();
		  else
			  System.out.println("Button is not enabled");
		  Thread.sleep(4000);
	  }
	  @Test(priority=5)

	  public void addUser() throws InterruptedException, AWTException {
		  driver.findElement(By.xpath("//div[text()=\"-- Select --\"]")).click();
		  Robot r =new Robot();
		  r.keyPress (KeyEvent. VK_DOWN) ;
		  Thread.sleep (2000);
		  r.keyPress (KeyEvent. VK_DOWN) ;
		  Thread. sleep (2000);
		  r.keyPress (KeyEvent. VK_ENTER);
		  
		  driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]")).click();
		  Robot m =new Robot();
//		  m.keyPress (KeyEvent. VK_DOWN) ;
//		  Thread.sleep (2000);
		  m.keyPress (KeyEvent. VK_DOWN) ;
		  Thread. sleep (2000);
		  m.keyPress (KeyEvent. VK_ENTER);
	  }
	  @Test(priority=6)
	  public void addUserName() throws InterruptedException {
		  Thread.sleep(3000);
		 
		 // driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Test 123");
		  driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("priyanka4");
		  driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Pssword@123");
		  driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Pssword@123");
	  }
	  @Test(priority=7)
	  public void SuggestedName() throws AWTException, InterruptedException {
		  WebElement emp_name=driver.findElement(By.xpath("//input[@ placeholder=\"Type for hints...\"]"));
	      emp_name.click();
	      emp_name.sendKeys("a");
	      Robot r1=new Robot();
	      r1.keyPress(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      r1.keyPress(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      r1.keyPress(KeyEvent.VK_DOWN);
	      Thread.sleep(2000);
	      r1.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	  }
	  @Test(priority=8)
	  public void SaveButton() {
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  }
	}


