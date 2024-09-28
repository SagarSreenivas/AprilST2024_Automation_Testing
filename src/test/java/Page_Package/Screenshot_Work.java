package Page_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot_Work {
WebDriver driver;
By ajioscreenshot=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[1]/a/span");
public Screenshot_Work(WebDriver driver)
{
	this.driver=driver;
}
public void ScreenShot() throws IOException
{
	//Full Screenshot//
	driver.findElement(ajioscreenshot);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\homepage.png");
	FileUtils.copyFile(src,trg);
	
	//Sectional Screenshot//
	/*WebElement section=driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div"));
	File src=section.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\ajiosection.png");
	FileUtils.copyFile(src,trg);*/
	
	//Section od WebElement Screenshot//
	/*WebElement section_element=driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[2]/a/img"));
	File src=section_element.getScreenshotAs(OutputType.FILE);
	File trg=new File(".\\screenshots\\logoelement.png");
	FileUtils.copyFile(src,trg);*/
}
}
