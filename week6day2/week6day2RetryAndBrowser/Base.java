package week6day2RetryAndBrowser;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5day2.Assignment.ReadExcel;

public class Base 
{
	public static ChromeDriver driver;
	public String filename;	
	 @BeforeMethod
	  public void beforeMethod()
	 {
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  driver.close();
	  }
	  @DataProvider(name = "fetchData")
	  public String[][] sendData() throws IOException {
		  return ReadExcel.read(filename); 
	  }
}
