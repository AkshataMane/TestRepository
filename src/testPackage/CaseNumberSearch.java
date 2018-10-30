package testPackage;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;



public class CaseNumberSearch {
	public static String driverPath = Constants.DRIVER_PATH;
	public static WebDriver driver;
     @BeforeClass
     public void beforeClass()
     {
    	 System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         
         
     }
     
     @Test
     public void startApp() throws Exception
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
		for( int i = 0; i < 1 ; i++) {
     	driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[4]/label/div")).click();
		Thread.sleep(2000);
		String [] caseNo = getCaseNumber();
		String tempCasNo = null;
		for( int n = 0; n < caseNo.length; n++) {
 			 tempCasNo = caseNo[n];
 			System.out.println("tempCasNo"+tempCasNo);
			driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[8]/div/div/input")).clear();	
			driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[8]/div/div/input")).sendKeys(tempCasNo);
			Thread.sleep(2000);
			System.out.println("tempCasNo1111"+tempCasNo);
			WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[2]/div/div[2]/select"));
			Thread.sleep(2000);
			Select se2 = new Select(element2);
			se2.selectByVisibleText("Search in Petitioner/Respondent");
			Thread.sleep(2000);
			// clicking search button
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
		
		
		}
		
      }
     @AfterClass
     public void afterClass()
     {
    	 driver.quit();
     }
     public  String[] getCaseNumber() throws Exception{
    	 String filename = "/home/onlinerti/Files/CaseNumberYear.xls";
 		FileInputStream fs;
 		fs = new FileInputStream(filename);
 		Workbook wb = Workbook.getWorkbook(fs);
 		Sheet sh = wb.getSheet("Sheet1");
 		String CASE_NO = null;
// 		String[] c = null;
// 		String tempCasNo = null;
 		String [] resultList = null;
 		ArrayList<String> arrlist = new ArrayList<String>(100);
 		for (int row = 1; row < 5; row++){
 			CASE_NO = sh.getCell(2,row).getContents();
 			CASE_NO = CASE_NO.toString();
 			CASE_NO = CASE_NO.trim();
 			System.out.println("CASE_NO="+CASE_NO);
 			arrlist.add(CASE_NO);
 			resultList = arrlist.toArray(new String[arrlist.size()]);
 	 		
 		}
 		
		return resultList;
 	
		
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