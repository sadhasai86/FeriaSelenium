

package WebDriverProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//		FileInputStream file = new FileInputStream("C:\\Users\\Krish\\workspace\\Selenium\\data\\DataInput.xlsx");
		
		//String excelFilePath = "C:\\Users\\Krish\\workspace\\Selenium\\data\\DataInput.xlsx";
		FileInputStream filers = new FileInputStream("C:\\Users\\Tiger\\workspace\\SeleniumTraining\\data\\Logindata.xlsx");
		@SuppressWarnings("resource")
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFWorkbook workbook = new XSSFWorkbook(filers);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			driver.get("https://www.linkedin.com/uas/login");
			driver.findElement(By.name("session_key")).sendKeys(
					cell.getStringCellValue());
			driver.findElement(By.name("session_password")).sendKeys(
					cell2.getStringCellValue());
			driver.findElement(By.name("signin")).click();
			driver.findElement(By.linkText("Sign Out")).click();
			
		}
		driver.close();
	}
}
