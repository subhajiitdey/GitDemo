package Maven_TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
  WebDriver driver;	
	
  @Test
  public void Login() {
	  
	  driver.get("https://www.demo.guru99.com/V4/");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr391577");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("bEjebyd");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  
	  
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  
	  if (driver != null) {
          driver.quit();
      }
  }

}
