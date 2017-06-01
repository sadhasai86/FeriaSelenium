package WebDriverProgramming;

import java.util.concurrent.TimeUnit;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver for Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Tiger\\workspace\\SeleniumTraining\\driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Tiger\\workspace\\SeleniumTraining\\driver\\IEDriverServer.exe");
	
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//setting implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//opening a webpage
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElement(By.name("userRegistrationForm:userName")).sendKeys("Sadhasivam");
		
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("password");
		
		//selecting value from dropdown
		
		WebElement ele = driver.findElement(By.name("userRegistrationForm:securityQ"));
		
		Select ele1 = new Select(ele);
		
		ele1.selectByIndex(8);
		
		driver.findElement(By.name("userRegistrationForm:securityAnswer")).sendKeys("Tiger");
		driver.findElement(By.name("userRegistrationForm:firstName")).sendKeys("Sadhasivam");
		
		driver.close();
		
		driver.findElement(By.name("lastName")).sendKeys("Sounder");
		
		
		WebElement gender = driver.findElement(By.name("gender"));
		Select gender1 = new Select(gender);
		gender1.selectByVisibleText("Male");
		
		WebElement gende = driver.findElement(By.name("gender"));
		Select gender11 = new Select(gende);
		gender11.selectByVisibleText("Male");

		WebElement mari = driver.findElement(By.name("maritalStatus"));
		Select marital = new Select(mari);
		marital.selectByValue("0");
		
		driver.close();
		
	
		
	}

}
