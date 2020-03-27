package com.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Hms {
	public  WebDriver driver;
	
	
// This method is  used to find login form is formed or not	
   @Test(priority=1)
   public void login() {
     driver.findElement(By.name("username")).sendKeys("admin");
     driver.findElement(By.name("password")).sendKeys("admin");	  
     driver.findElement(By.name("submit")).click();
	  }
     
  //This method is used to find registration is formed or not
      @Test(priority=2)
      public void Registration() {
	    driver.findElement(By.linkText("Registration")).click();
	  }
  
	
	 
//This method is used to formed the permanent registration	 
      @Test(priority=3)
      public void perminentRegistration() throws Exception {
	      driver.findElement(By.linkText("Registration")).click();
		  new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		  new Select(driver.findElement(By.name("TITLE"))).selectByIndex(2);
		  driver.findElement(By.name("PNT_NAME")).sendKeys("pavan");
		  driver.findElement(By.name("MIDDLE_NAME")).sendKeys("mannava");
		  driver.findElement(By.name("LAST_NAME")).sendKeys("Kumar");
		  driver.findElement(By.name("DOB")).sendKeys("04-03-2020");
		  driver.findElement(By.name("AGE")).sendKeys("20");
		  new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		  new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		  new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		  new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		  new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
		  driver.findElement(By.name("MOTHER_NAME")).sendKeys("mannava");
		  new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("CCRPM4137R");
		  new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		  new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		  new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		  new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		  new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("O+");
		  new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		  new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		  driver.findElement(By.name("ADDRESS1")).sendKeys("vinjanampadu");
		  driver.findElement(By.name("MOBILE_NO")).sendKeys("1234567998");
		  driver.findElement(By.name("EMAIL_ID")).sendKeys("mannavapavankumar@gmail.com");
		  new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		  driver.findElement(By.name("ADDRESS2")).sendKeys("Guntur");
		  driver.findElement(By.name("ZIP")).sendKeys("522017");
		  driver.findElement(By.name("image")). sendKeys("F:\\Testing software\\download.jpg");
		  Thread.sleep(2000);
		  driver.findElement(By.name("submit")).click();
		 
		  Thread.sleep(5000);
		  
		
		  //String is used to print the console 
		  String str =driver.switchTo().alert().getText(); 
		  System.out.println(str);
		 
		  
		    driver.switchTo().alert().accept();
		  
    }
  
     	 
 //This method is used to formed the permanent registration	
       @Test(priority=4)
       public void emergency_registraion() throws Exception  {
	       driver.findElement(By.linkText("Emergency Registration")).click();
	       new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
	       new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	       driver.findElement(By.name("PNT_NAME")).sendKeys("Ramesh");
	       driver.findElement(By.name("MIDDLE_NAME")).sendKeys("kumar");
	       driver.findElement(By.name("LAST_NAME")).sendKeys("mannava");
	       driver.findElement(By.name("DOB")).sendKeys("24-02-2018");
	       driver.findElement(By.name("AGE")).sendKeys("20");
	       new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	       new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	       new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	       new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	       new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	       driver.findElement(By.name("MOTHER_NAME")).sendKeys("mannava");
	       new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
	       driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("CCRPM4137R");
	       new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("USA");
	       new Select(driver.findElement(By.name("IS_MLC"))).selectByIndex(1);
	       new Select(driver.findElement(By.name("EDUCATION"))).selectByIndex(2);
	       new Select(driver.findElement(By.name("OCCUPATION"))).selectByIndex(2);
	       new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByIndex(4);
	       new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByIndex(3);
	       new Select(driver.findElement(By.name("SC_PROOF"))).selectByIndex(1);
	       driver.findElement(By.name("ADDRESS1")).sendKeys("guntur");
	       driver.findElement(By.name("MOBILE_NO")).sendKeys("1234567896");
	       driver.findElement(By.name("EMAIL_ID")).sendKeys("mpavan@gmail.com");
	       new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByIndex(1);
	       driver.findElement(By.name("ADDRESS2")).sendKeys("Guntur");
	       driver.findElement(By.name("ZIP")).sendKeys("522017");
	       driver.findElement(By.name("image")).sendKeys("F:\\Testing software\\download.jpg");
	       driver.findElement(By.name("submit")).click();
	       Thread.sleep(3000);
	       driver.switchTo().alert().accept();
	   }
       
       
  
	
	
	  @Test(priority=5) 
	  public void searchRegistration() throws Exception {
	  driver.findElement(By.linkText("Search Registration")).click(); 
	  driver.findElement(By.name("search")).sendKeys("pavan");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Next")).click();
	  Thread.sleep(6000);
	  //driver.findElement(By.linkText("Prev")).click();
	  driver.findElement(By.linkText("Next")).click();
	 // Thread.sleep(6000);
	  //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[8]/tbody/tr/td[2]/a/input")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/table[8]/tbody/tr/td[1]/a/input")).click();
	  }
	 
	 
	 
   //index.php?msg=Successfully%20Logged%20out
     
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver","F:\\Testing software\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  driver.manage().window().maximize();
  }

	
	  @AfterTest
	  public void afterTest() { 
		  
	  }
	 

}
