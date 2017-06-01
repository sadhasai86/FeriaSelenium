package WebDriverProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiger\\workspace\\SeleniumTraining\\driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Tiger\\workspace\\SeleniumTraining\\driver\\chromedriver.exe");
		
				//WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();
			
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.bankofamerica.com/");
		
		WebElement mouseelement = driver.findElement(By.xpath(".//*[@id='hp-section-2']/form/ul/li[1]/a"));
		
		WebElement mouseover = driver.findElement(By.xpath(".//*[@id='pm-submenu-first']/div/a[4]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mouseelement).perform();
		
		Thread.sleep(2000);
		
		act.click(mouseover).perform();
		
		System.out.println("hello");
		driver.close();
		driver.quit();
		
	}

}
