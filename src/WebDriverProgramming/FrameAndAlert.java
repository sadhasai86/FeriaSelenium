package WebDriverProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameAndAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    //Load the URL//
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
		WebElement ele = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(ele);
		
		driver.findElement(By.cssSelector("button")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		Object s = driver.findElement(By.id("demo")).hashCode();
		System.out.println(s);
		
		
	
			
		
		
		
		//driver.switchTo().frame(driver.findElement(By.className("iframe")));
		  
		 	

	}

}
