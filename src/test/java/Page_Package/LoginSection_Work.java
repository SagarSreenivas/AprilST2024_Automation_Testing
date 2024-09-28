package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSection_Work {
	ChromeDriver driver;
	By ajiosignin=By.xpath("//*[@id=\"loginAjio\"]");
	By ajiophone=By.name("username");
	By ajiologin=By.className("login-btn");
	By ajiologinclose=By.xpath("//*[@id=\"closeBtn\"]");

    public LoginSection_Work(WebDriver driver)
    {
    	this.driver=((ChromeDriver) driver);
    }
	public void clicklogin()
	{
		driver.findElement(ajiosignin).click();
	}
	public void setvalues(String username)//to send values//
	{
		driver.findElement(ajiophone).sendKeys(username);
	}
	public void login()
	{
		driver.findElement(ajiologin).click();
	}
	public void loginclose()
	{
		driver.findElement(ajiologinclose).click();
	}
}
