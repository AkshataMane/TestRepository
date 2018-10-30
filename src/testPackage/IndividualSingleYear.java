package testPackage;

import static org.testng.Assert.assertEquals;

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

public class IndividualSingleYear {
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
       	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[3]/label/div")).click();
  		Thread.sleep(2000);			
  		
  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[1]/textarea")).sendKeys("Amar Sharma");
  		Thread.sleep(2000);			
  		
  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[2]/textarea")).sendKeys("Radheshyam Sharma");
  		Thread.sleep(2000);
  		
  		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[3]/textarea")).sendKeys("jhotwara 51, pawanpuri, charan nadi, near nadi ka phatak, Jhotwara Jaipur Jaipur Rajasthan - 302012");
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
     public void CaseStatusSingle() throws InterruptedException
     {
    	//2017 (74)
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[1]")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
  		Thread.sleep(2000);
 		
 		
 		String st = check();
 		System.out.println("Result="+st);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
 		Thread.sleep(2000);
 		
 		//2018 (4)
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
 		Thread.sleep(2000);
 		 st = check();
 		System.out.println("Result="+st);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
 		Thread.sleep(2000);
 		// Not Known (2)
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
 		Thread.sleep(2000);
 		 st = check();
  		System.out.println("Result="+st);
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
 		Thread.sleep(2000);
 		//2016 (1)
 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[4]/input")).click();
		Thread.sleep(2000);
		 st = check();
 		System.out.println("Result="+st);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[4]/input")).click();
		Thread.sleep(2000);

 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[2]")).click();
 		Thread.sleep(2000);
  		
 		}
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
         
         
     }
public String check() throws InterruptedException {
	
		
	String[] str = {"2017","2014","2016","2015"};
	String res = null;
	for(int i = 0; i< str.length; i++) {
		String val = str[i];
		driver.findElement(By.xpath("/html/body/div/div/div[4]/div[5]/div[1]/div/ul/div[1]/li[1]")).click();
		Thread.sleep(2000);
	String msg = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[11]/div[2]")).getText();
		System.out.println("msg="+msg);		
		System.out.println("val="+val);		
		if(msg.contains(val)) {
			System.out.println(" Filter working"+val);
			res = "pass";
			break;
		}else {
			System.out.println(" Filter FAILED"+val);
			res = "fail";
		}
		
	}
	return res;
}

}
     
    


