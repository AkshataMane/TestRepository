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

public class Reports {
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
      }
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
         
         
     }
     @Test(dependsOnMethods="startApp")
     public void reports() throws InterruptedException
      {
    	//Request Report
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/a[3]/h3")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sizeLarge\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[2]/div[1]/textarea")).sendKeys("Ayurwin Pharma");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/label/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/div[1]/textarea")).sendKeys("Amar Sharma");
			Thread.sleep(2000);			
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/div[2]/textarea")).sendKeys("Radheshyam Sharma");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/div[3]/textarea")).sendKeys("jhotwara 51, pawanpuri, charan nadi, near nadi ka phatak, Jhotwara Jaipur Jaipur Rajasthan - 302012");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/div[4]/textarea")).sendKeys("12/12/1990");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();
			Thread.sleep(2000);
			//View Report
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/textarea")).sendKeys("1530004866096");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/button")).click();
			Thread.sleep(2000);
			
			
			//All Reports
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[3]")).click();
			Thread.sleep(2000);
			WebElement dateBox5 = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[1]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox5.sendKeys("04/01/2018");
	        //Press tab to shift focus to time field
	        dateBox5.sendKeys(Keys.TAB);
	        
	        WebElement dateBox6 = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[2]/input"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox6.sendKeys("04/10/2018");
	        //Press tab to shift focus to time field
	        dateBox6.sendKeys(Keys.TAB);
	        
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/button")).click();
			Thread.sleep(2000);
			
			
			
//			driver.findElement(By.xpath("//*[@id=\"allReports_paginate\"]/span/a[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"allReports_paginate\"]/span/a[3]")).click();
//			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//*[@id=\"allReports_next\"]")).click();
			Thread.sleep(2000);
			WebElement element10 = driver.findElement(By.xpath("//*[@id=\"allReports_length\"]/label/select"));
			Thread.sleep(2000);
			Select se10 = new Select(element10);
			se10.selectByVisibleText("25");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"allReports_filter\"]/label/input")).sendKeys("Ayurwin Pharma");
			Thread.sleep(2000);
			//Email Notification
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[1]/div/input")).sendKeys("akshata@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[1]/div/button")).click();
			Thread.sleep(2000);
			
			
      }
}