package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AggCourt {
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
 		
 		String num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
  		System.out.println("Number="+num);			
  		int total = 0;
  		 int grandTot = getNumber(num);
  		System.out.println("Grand Total="+grandTot);
 		
 		//National Company Law Tribunal (2)
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[1]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
 		Thread.sleep(2000);
 		num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
 		Thread.sleep(2000);
 		int value = getNumber(num);
  		total = total + value;
 		//Debts Recovery Tribunal (1)
 		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
  		Thread.sleep(2000);
  		num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
  		Thread.sleep(2000);
  		value = getNumber(num);
  		total = total + value;
  		// High Court Of Calcutta (1)
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[3]/input")).click();
  		Thread.sleep(2000);
  		num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[3]/input")).click();
  		Thread.sleep(2000);
  		value = getNumber(num);
  		total = total + value;
  		//Mca Defaulter List (1)
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[4]/input")).click();
 		Thread.sleep(2000);
 		num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[4]/input")).click();
 		Thread.sleep(2000);
 		value = getNumber(num);
  		total = total + value;
 
  		System.out.println("Grand Total="+grandTot);
  		System.out.println("total="+total);
  		if(total == grandTot) {
  			System.out.println("Court Aggregate filter pass");
  		}else {
  			System.out.println("Court Aggregate filter FAIL");
  		}
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[2]")).click();
  		Thread.sleep(2000);
      }
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
         
         
     }
     private int getNumber(String num) {
  		String[] n = num.split("of");
  		String b = null;
  		String s = null;
  		int results = 0;
  		for( int m = 0 ; m < n.length; m++) {
  			 b = n[1];
  			b = b.trim();
  			String[] y = b.split(" ");
  			for(int z = 0; z < y.length-2; z++) {
  			
  				System.out.println("y="+s);
  				
  				s = y[0];
  				
  			}
  			
  			
  		}
  		 results = Integer.parseInt(s);		
  		return results;
  	}
}
