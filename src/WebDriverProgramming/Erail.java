package WebDriverProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Erail {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Load URl
		
		//FileInputStream file  = new FileInputStream(arg0))
		
		
		FileReader fre = new FileReader("prop.properties");
		
		Properties pp = new Properties();
		 
		pp.load(fre);
		//pp.setProperty("urll","www.google.com" );
		
		driver.get(pp.getProperty("URL"));
		
		driver.findElement(By.id(pp.getProperty("StationFrom"))).clear();
		driver.findElement(By.id(pp.getProperty("StationFrom"))).sendKeys("Pune", Keys.TAB);
		
		driver.findElement(By.id(pp.getProperty("StationTo"))).clear();
		driver.findElement(By.id(pp.getProperty("StationTo"))).sendKeys("SBC", Keys.TAB);

		System.out.println(driver.findElement(By.xpath(pp.getProperty("TrainNo"))).getText());
	 	
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		int i = 1;
		FileUtils.copyFile(src, new File("reports\\snap" +i+".jpg"));
		*/

		/*	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("reports\\snap"+i+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			i++;
		}*/
		
		
		
		
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		int i = 1;
		FileUtils.copyFile(src, new File("reports\\snap"+i+".jpg"));
		
		
		i++;*/
		
		
	}

}
