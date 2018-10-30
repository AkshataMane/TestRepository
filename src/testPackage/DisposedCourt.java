package testPackage;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DisposedCourt {
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
     	// Correct credentials
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
		
      }
     
  		@Test(dependsOnMethods="startApp")
  	     public void PenRegion() throws InterruptedException
  	     {
  		
  	  		
  		//Disposed
 	    	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[1]")).click();
 	  		Thread.sleep(2000);
 	  	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/h3")).click();
 		Thread.sleep(2000);
 			
  	  		
  	  	//CourtType
  	  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[1]")).click();
  	  		Thread.sleep(2000);
  	  		
  			String l1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/h3")).getText();
  	  		System.out.println("Number="+l1 );	
  	  		String l2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/h3")).getText();
  	  		System.out.println("Number="+l2);	
  	  		String l3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/h3")).getText();
  	  		System.out.println("Number="+l3);	
  	  		String l4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[4]/h3")).getText();
  	  		System.out.println("Number="+l4);	

  	  		ArrayList<String> arrlist = new ArrayList<String>(100);
  	  		arrlist.add(l1);
  	  		arrlist.add(l2);
  	  		arrlist.add(l3);
  	  		arrlist.add(l4);
  	  		//District Court
  	  	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
  		Thread.sleep(2000);
  	  									
  	  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[5]/div[1]/div/ul/div[1]/li[1]")).click();
  		  		Thread.sleep(2000);
  		  		
  		  		String pen = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  		  		Thread.sleep(2000);
  		  		System.out.println("Pen="+pen);
  		  		String kar = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  		  		Thread.sleep(2000);						
  		  		System.out.println("District Court"+l1);
  		  		
  		  		if(pen.equalsIgnoreCase("Disposed") && ((kar).contains(l1))) {
  		 			System.out.println(pen+kar+" Filter working");
  		 		}else {
  		 			System.out.println(pen+kar+"CourtType Filter FAILED");
  		 		}
  		  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
  		 		Thread.sleep(2000);
  	  	
  		 		
  		 	//Tribunal
  		 	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
  	   		Thread.sleep(2000);
  	  	  									
  	  	  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[5]/div[1]/div/ul/div[1]/li[1]")).click();
  	  		  		Thread.sleep(2000);
  	  		  		
  	  		  		 pen = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	  		  		Thread.sleep(2000);
  	  		  		System.out.println("Pen="+pen);
  	  		  		 kar = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	  		  		Thread.sleep(2000);
  	  		  		System.out.println("Tribunal"+l2);
  	  		  		
  	  		  		if(pen.equalsIgnoreCase("Disposed") && ((kar).contains(l2))) {
  	  		 			System.out.println(pen+kar+" Filter working");
  	  		 		}else {
  	  		 			System.out.println(pen+kar+"CourtType Filter FAILED");
  	  		 		}
  	  		  	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
  	     		Thread.sleep(2000);
  	     	// High Court (1)
  	     		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
  	     		Thread.sleep(2000);
  	  	  	  									
  	  	  	  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[5]/div[1]/div/ul/div[1]/li[1]")).click();
  	  	  		  		Thread.sleep(2000);
  	  	  		  		
  	  	  		  		 pen = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	  	  		  		Thread.sleep(2000);
  	  	  		  		System.out.println("Pen="+pen);
  	  	  		  		 kar = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	  	  		  		Thread.sleep(2000);
  	  	  		  		System.out.println("High Court"+l3);
  	  	  		  		
  	  	  		  		if(pen.equalsIgnoreCase("Disposed") && ((kar).contains(l3))) {
  	  	  		 			System.out.println(pen+kar+" Filter working");
  	  	  		 		}else {
  	  	  		 			System.out.println(pen+kar+"CourtType Filter FAILED");
  	  	  		 		}
  	  	  		  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
  	  	   		Thread.sleep(2000);
  	  	     		
	  	     	//List (1)
	  	     		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[4]/input")).click();
	  	    		Thread.sleep(2000);
  	   	  	  									
  	   	  	  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[5]/div[1]/div/ul/div[1]/li[1]")).click();
  	   	  		  		Thread.sleep(2000);
  	   	  		  		
  	   	  		  		 pen = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	   	  		  		Thread.sleep(2000);
  	   	  		  		System.out.println("Pen="+pen);
  	   	  		  		 kar = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[7]/div[2]")).getText();
  	   	  		  		Thread.sleep(2000);
  	   	  		  		System.out.println("List"+l4);
  	   	  		  		
  	   	  		  		if(pen.equalsIgnoreCase("Disposed") && ((kar).contains(l4))) {
  	   	  		 			System.out.println(pen+kar+" Filter working");
  	   	  		 		}else {
  	   	  		 			System.out.println(pen+kar+"CourtType Filter FAILED");
  	   	  		 		}
  	   	  		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[4]/input")).click();
  	     		Thread.sleep(2000);
  	     }
  		 @AfterClass
  	     public void afterClass()
  	     {
  	    	 driver.quit();
  	         
  	         
  	     }
}