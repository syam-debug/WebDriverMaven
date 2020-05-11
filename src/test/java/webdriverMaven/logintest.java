package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class logintest {
	
	
	//System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			//FirefoxDriver driver= new FirefoxDriver();
			//driver.get("http://google.com");
	public static WebDriver driver1;
	@BeforeSuite
	public void setUp() {
	}
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		//driver.get("http://google.com");
		driver1= new FirefoxDriver();
	}
	@Test
	public void dologin()
	{
		driver1.get("http://gmail.com");
		driver1.findElement(By.id("identifierId")).sendKeys("n.syamprasad@gmail.com");
		System.out.println("dfgdfgdfgdfg123456789");
		//driver1.findElement(By.id("Passwd")).sendKeys("Nithya@Tejas2628");
		
	}
	@AfterSuite
	public void teardown()
	{ 
	driver1.quit();
	}
	

}
