package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddCart_Work {
	WebDriver driver;
	By ajiosearch=By.name("searchVal");
	By addcart1=By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[10]/div[1]/div[1]/div");
	By addcart2=By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[10]/div[1]/div[1]/div/span[2]");
	public AddCart_Work(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checksearch()
	{
		driver.findElement(ajiosearch).click();
	}
	public void setvalues1(String name)
	{
		driver.findElement(ajiosearch).sendKeys("Watches for Men",Keys.ENTER);
	}
	public void add_item()
	{
		driver.get("https://www.ajio.com/uniquest-blue-dial-analogue-fashion-watch-for-men/p/469456987_blue");
		driver.findElement(addcart1).click();
		driver.get("https://www.ajio.com/uniquest-black-dial-analogue-fashion-watch-with-leather-strap-for-men/p/469457011_black");
		driver.findElement(addcart2).click();
		}
}

