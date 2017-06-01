	package WebDriverProgramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoAut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://110.227.33.59:4444/wd/hub"), dc);
		*/
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		FileInputStream file = new FileInputStream(".\\data\\Logindata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			driver.get("https://in.linkedin.com/");
			driver.findElement(By.name("session_key")).sendKeys(
					cell.getStringCellValue());
			driver.findElement(By.name("session_password")).sendKeys(
					cell2.getStringCellValue());
			driver.findElement(By.id("login-submit")).click();
			//driver.findElement(By.linkText("SIGN-OFF")).click();
			
		}
		driver.close();
		
	}

}
