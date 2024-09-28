package Page_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDown_Work {
WebDriver driver;
By scroll_down=By.xpath("//*[@id=\"appContainer\"]/div[3]/footer/div[2]");

public ScrollDown_Work(WebDriver driver)
{
	this.driver=driver;
}
public void check_scrolldown() throws Exception
{
	//Scroll Full downward//
	Thread.sleep(2000);
	JavascriptExecutor js3=(JavascriptExecutor) driver;
    js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    driver.findElement(scroll_down).click();
    
	//Sroll downward//
    //Thread.sleep(2000);
    //JavascriptExecutor js1=(JavascriptExecutor) driver;
    //js1.executeScript("window.scrollBy(0,5000)","");
    
	//Scroll downword and upward//
    //Thread.sleep(2000);
    //JavascriptExecutor js2=(JavascriptExecutor) driver;
    //js2.executeScript("window.scrollBy(0,-5000)","");
  }
}
