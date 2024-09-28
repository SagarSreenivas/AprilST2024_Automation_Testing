package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElements_Work {
WebDriver driver;
By ajiomen=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[1]/a/span");
By ajiowomen=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[2]/a/span");
By ajiokids=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[3]/a/span");
By ajiobeauty=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[4]/a/span");
By ajiohomeandkitchen=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[5]/a/span");

public WebElements_Work(WebDriver driver)
{
	this.driver=driver;
}
public void webelements_check() throws Exception
{
	driver.findElement(ajiomen).click();
	Thread.sleep(1000);
	driver.findElement(ajiowomen).click();
	Thread.sleep(1000);
	driver.findElement(ajiokids).click();
	Thread.sleep(1000);
	driver.findElement(ajiobeauty).click();
	Thread.sleep(1000);
	driver.findElement(ajiohomeandkitchen).click();
	Thread.sleep(1000);
}
}
