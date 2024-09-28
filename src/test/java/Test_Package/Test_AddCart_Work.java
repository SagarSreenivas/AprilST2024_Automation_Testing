package Test_Package;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Package.AddCart_Work;

public class Test_AddCart_Work {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod 
	public void url()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.ajio.com");
	}
	@Test
	public void test() 
	{
		driver.manage().window().maximize();
		AddCart_Work obj=new AddCart_Work(driver);
		obj.checksearch();
		obj.setvalues1("Watches for Men");
		obj.add_item();
	}
}
