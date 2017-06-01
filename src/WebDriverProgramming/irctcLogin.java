package WebDriverProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class irctcLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver  = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		 
		 driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 
		 driver.findElement(By.xpath("))
	}

}
