package WebDriverProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Report");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("UserName");
		
		
		row.createCell(1).setCellValue("Password");
		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Nilesh");
		
		FileOutputStream file = new FileOutputStream(new File("C:\\Users\\Tiger\\workspace\\SeleniumTraining\\Report.xlsx"));
		
		workbook.write(file);
		
		file.close();
		
		
	}

}
