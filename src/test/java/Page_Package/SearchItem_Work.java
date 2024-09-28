package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchItem_Work {
WebDriver driver;
By ajiosearch_ikon=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span");
By ajiosearch=By.name("searchVal");
public SearchItem_Work(WebDriver driver)
{
	this.driver=driver;
}
public void checksearch()
{
	driver.findElement(ajiosearch_ikon).click();
	driver.findElement(ajiosearch).click();
}
public void setvalues1(String name)
{
	driver.findElement(ajiosearch).sendKeys("Nike Shoes",Keys.ENTER);
}
}
