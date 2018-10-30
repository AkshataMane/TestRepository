package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StartClass {
	
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

@Test(dependsOnMethods="startApp")
public void TextSearch() throws InterruptedException
{
	WebElement radioBtn = driver.findElement(By.xpath("//*[@id=\"sizeLarge\"]"));
	radioBtn.click();
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[7]/div/div/textarea")).sendKeys("Ayurwin Pharma");
	Thread.sleep(2000);
	
	
//	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/input")).sendKeys("Ayurwin Pharma");
//	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
	Thread.sleep(2000);
	Select se = new Select(element);
	se.selectByVisibleText("Search in Petitioner");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
	Thread.sleep(2000);
//		
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/h3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/h3")).click();
	Thread.sleep(2000);
//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);

    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	////
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/a[1]/h3")).click();
	Thread.sleep(4000);
      
}   
@AfterClass
public void afterClass()
{
	 driver.quit();
    
    
}
@Test(dependsOnMethods="startApp")
public void CompanySearch() throws InterruptedException
{
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[2]/label/div")).click();
	Thread.sleep(2000);			
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[6]/div/div[1]/textarea")).sendKeys("Ayurwin Pharma");
	Thread.sleep(2000);
	
	WebElement element1 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
	Thread.sleep(2000);
	Select se1 = new Select(element1);
	se1.selectByVisibleText("Search in Petitioner");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/h3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/h3")).click();
	Thread.sleep(2000);
//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(4000);
	
}
@Test(dependsOnMethods="startApp")
public void IndividualSearch() throws InterruptedException
{
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[3]/label/div")).click();
	Thread.sleep(2000);			
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[1]/textarea")).sendKeys("Amar Sharma");
	Thread.sleep(2000);			
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[2]/textarea")).sendKeys("Radheshyam Sharma");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[5]/div/div[3]/textarea")).sendKeys("jhotwara 51, pawanpuri, charan nadi, near nadi ka phatak, Jhotwara Jaipur Jaipur Rajasthan - 302012");
	Thread.sleep(2000);
	WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
	Thread.sleep(2000);
	Select se11 = new Select(element2);
	se11.selectByVisibleText("Search in Petitioner");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/h3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/h3")).click();
	Thread.sleep(2000);
//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[4]/input")).click();
	Thread.sleep(2000);
	//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[4]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	//
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[5]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[2]/input")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[2]/ul/li[1]/input")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[6]/div[1]/div[2]/h3[2]")).click();
	Thread.sleep(4000);

}
@Test(dependsOnMethods="startApp")
public void CaseNoSearch() throws InterruptedException
{
	WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[4]/label/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[8]/div/div/input")).sendKeys("C.R.P. 1/2001");
	Thread.sleep(2000);
	Select se2 = new Select(element2);
	se2.selectByVisibleText("Search in Petitioner/Respondent");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[3]/div/button[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/a[1]/h3")).click();
	Thread.sleep(2000);
	
 }
}