package Test_Package;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Package.LoginSection_Work;

public class Test_LoginSection_Work {
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
public void test() throws Exception
{
	driver.manage().window().maximize();
	LoginSection_Work obj=new LoginSection_Work(driver);
	obj.clicklogin();
	obj.setvalues("1234567890");
	Thread.sleep(1000);
	obj.login();
	obj.loginclose();
}
}
