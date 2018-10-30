package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextSearch {
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
     public void ExactTextSearch() throws InterruptedException
      {
    	 driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[1]/label/div")).click();
 		Thread.sleep(2000);			
 		
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[7]/div/div/textarea")).sendKeys("Tata Motors");
 		Thread.sleep(2000);

 		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
 		Thread.sleep(2000);
 		Select se1 = new Select(element1);
 		se1.selectByVisibleText("Search in Petitioner/Respondent");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
 		Thread.sleep(2000);
 		
 		String  num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
 		int  value = getNumber(num);
 		System.out.println("Value="+value);
 		if(value > 0) {
			 System.out.println("Working");
		 }else {
			System.out.println("FAILED");
		 }
 		
      }
     
     @Test(dependsOnMethods="startApp")
     public void PartialTextSearch() throws InterruptedException
      {
    	 driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[1]/label/div")).click();
 		Thread.sleep(2000);			
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[7]/div/div/textarea")).clear();
 		
 		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[7]/div/div/textarea")).sendKeys("Anjali");
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
 		String  num = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[4]/div/div[2]/p")).getText();
 		System.out.println("Number="+num);
 		int  value = getNumber(num);
 		System.out.println("Value="+value);
 		 if(value > 0) {
 			 System.out.println("Working");
 		 }else {
 			System.out.println("FAILED");
 		 }
 		
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
