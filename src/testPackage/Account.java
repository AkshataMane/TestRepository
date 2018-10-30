package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Account {
	public static String driverPath = Constants.DRIVER_PATH;

	public static WebDriver driver;
     @BeforeClass
     public void beforeClass()
     {
    	 System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         
         
     }
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
         
         
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
      }
     @Test(dependsOnMethods="startApp")
     public void account() throws InterruptedException
      {
    	 driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/a[1]/h3")).click();
			Thread.sleep(2000);
	
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/h3")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/h3")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/h3")).click();
			Thread.sleep(2000);
			WebElement dateBox = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[1]/div/div[1]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox.sendKeys("04/01/2018");
	        //Press tab to shift focus to time field
	        dateBox.sendKeys(Keys.TAB);
	        
	        WebElement dateBox1 = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[1]/div/div[2]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox1.sendKeys("04/10/2018");
	        //Press tab to shift focus to time field
	        dateBox1.sendKeys(Keys.TAB);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[1]/div/div[3]/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/h3")).click();
			Thread.sleep(2000);
			WebElement dateBox2 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[1]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox2.sendKeys("04/01/2018");
	        //Press tab to shift focus to time field
	        dateBox2.sendKeys(Keys.TAB);
	        
	        WebElement dateBox3 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox3.sendKeys("04/10/2018");
	        //Press tab to shift focus to time field
	        dateBox3.sendKeys(Keys.TAB);
			driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[3]/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/h3")).click();
			Thread.sleep(2000);
			WebElement dateBox4 = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div[1]/div/div[1]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox4.sendKeys("04/01/2018");
	        //Press tab to shift focus to time field
	        dateBox4.sendKeys(Keys.TAB);
	        
	        WebElement dateBox5 = driver.findElement(By.xpath("/html/body/div[2]/div[7]/div[1]/div/div[2]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox5.sendKeys("04/10/2018");
	        //Press tab to shift focus to time field
	        dateBox5.sendKeys(Keys.TAB);
			driver.findElement(By.xpath("/html/body/div[2]/div[7]/div[1]/div/div[3]/button")).click();
			Thread.sleep(2000);
			
			
//			driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/h3")).click();
//			Thread.sleep(2000);
//    	 
      }
}