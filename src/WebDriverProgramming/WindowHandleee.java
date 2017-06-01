package WebDriverProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
				//maximize browser window
		driver.manage().window().maximize();
				
				//setting implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//opening a webpage
				
				driver.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
				
				
				String parentwindow = driver.getWindowHandle();
				
				driver.findElement(By.linkText("Contact Us")).click();
				
				for(String winhanlde:driver.getWindowHandles())
					
				{
					driver.switchTo().window(winhanlde);
				}
				
				// to retrieve tite of second window
				System.out.println(driver.getTitle());
				
				//switch to parent window
				driver.switchTo().window(parentwindow);
				
				driver.close();
				
				
			
				
				
				
	}

}
