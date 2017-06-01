package WebDriverProgramming;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("i m in test");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i m in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i m in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i m in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("i m in after suite");
}

}
