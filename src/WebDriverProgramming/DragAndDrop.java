package WebDriverProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/selectable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement ele = driver.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
		WebElement ele1 = driver.findElement(By.xpath(".//*[@id='selectable']/li[2]"));
		WebElement ele2 = driver.findElement(By.xpath(".//*[@id='selectable']/li[3]"));
		WebElement ele3 = driver.findElement(By.xpath(".//*[@id='selectable']/li[4]"));
		/*Point item = driver.findElement(By.xpath(".//*[@id='sortable']/li[4]")).getLocation();
		
		System.out.println(item);*/
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(ele).clickAndHold(ele3).release().build().perform();
		
		driver.switchTo().defaultContent();
		driver.
		
		//builder.
		//builder.dragAndDropBy(ele, 11, 111).release().build().perform();
		
		driver.close();
		
	}

}
