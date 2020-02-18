package com.mobilestore;

   import org.testng.annotations.Test;
   import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

   public class MobileTestNG {
	
   public String url = "http://live.demoguru99.com";
   public WebDriver driver;
  
   @BeforeTest
   public void beforeTest() {
 
   System.setProperty("webdriver.chrome.driver","C:\\My chrome\\chromedriver.exe");
   		                                                
   driver = new ChromeDriver();
   
   } 
 
  @Test
  public void MobileTestCase() {
	  
  driver.navigate().to(url);
  driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
  driver.manage().window().maximize();
  String XperiaCost = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")).click();
  String XperiaDetail = driver.findElement(By.cssSelector("#product-price-1 > span")).getText();
  Assert.assertEquals(XperiaCost, XperiaDetail);
  }
  
  
  
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	
	  Thread.sleep(5000);
	driver.close();
  }
  

}
