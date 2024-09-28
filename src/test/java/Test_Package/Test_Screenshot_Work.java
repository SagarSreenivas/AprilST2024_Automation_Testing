package Test_Package;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Package.Screenshot_Work;

public class Test_Screenshot_Work {
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
	public void test() throws IOException
	{
		driver.manage().window().maximize();
		Screenshot_Work obj=new Screenshot_Work(driver);
		obj.ScreenShot();
}
}


