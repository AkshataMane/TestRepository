package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompnayCourtSingle {
	public static String driverPath = Constants.DRIVER_PATH;
	public static WebDriver driver;
     @BeforeClass
     public void beforeClass()
     {
    	 System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         
         
     }
     @Test
     public void startApp() throws InterruptedException
      {
     	
    	 driverPath = Constants.DRIVER_PATH;
      	driver.get(Constants.URL);
      	driver.manage().window().maximize();
      	
      	driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("onlinerti");
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("Getup@890");
      	Thread.sleep(2000);

      	driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[2]/label/div")).click();
 		Thread.sleep(2000);			
 		
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[6]/div/div[1]/textarea")).sendKeys("Ayurwin Pharma");
 		Thread.sleep(2000);

 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[1]/input")).click();
 		Thread.sleep(2000);
 		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
 		Thread.sleep(2000);
 		Select se1 = new Select(element1);
 		se1.selectByVisibleText("Search in Petitioner/Respondent");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
 		Thread.sleep(2000);
 		
 		
 		
 		//National Company Law Tribunal (2)
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[1]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/h3")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
 		Thread.sleep(2000);
 		//Debts Recovery Tribunal (1)
 		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/h3")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
  		Thread.sleep(2000);
  		// High Court Of Calcutta (1)
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[3]/h3")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[3]/input")).click();
  		Thread.sleep(2000);
  		//Mca Defaulter List (1)
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[4]/h3")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[4]/input")).click();
 		Thread.sleep(2000);
 
  		
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[2]")).click();
  		Thread.sleep(2000);
      }
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
         
         
     }
}
