package WebDriverProgramming;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapMethods {

	WebDriver driver;
	
	public void launchURL(String url)
	{
		try {
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Appliation failed to launch");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		
		
	}
	
	public void enterValueByName(String loc, String value)
	{
		try {
			driver.findElement(By.name(loc)).sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectValueByIndex(String loc, int no)
	{
		WebElement ele = driver.findElement(By.name(loc));
		Select ele1 = new Select(ele);
		ele1.selectByIndex(no);
			
	}
	
	public void closeApp()
	{
		driver.close();
	}
	
}
