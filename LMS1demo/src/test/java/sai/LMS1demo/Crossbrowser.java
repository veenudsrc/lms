package sai.LMS1demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
 
import org.testng.annotations.Parameters;

//import java.net.*;

import org.testng.annotations.Test;
public class Crossbrowser {
	
WebDriver driver;
	 
    /**
 
     * This function will execute before each Test tag in testng.xml
 
     * @param browser
 
     * @throws Exception
 
     */
 
@BeforeTest
 
    @Parameters("browser")

public void setup(String browser) throws Exception{
	 
    //Check if parameter passed from TestNG is 'firefox'

    if(browser.equalsIgnoreCase("firefox")){

    //create firefox instance
    	System.out.println("Inside set up..added by Veenu on 24/8");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        
        //create chrome instance

      driver = new ChromeDriver();
      System.out.println("Initialising chrome driver"); 
    }


}


 
    //public void setup(String browser) throws Exception{
//	 public void setup() throws Exception{
		 
		 
        //Check if parameter passed from TestNG is 'firefox'
 
      //  if(browser.equalsIgnoreCase("firefox")){
 
        //create firefox instance
//        	try {
//        	System.out.println("inside FF");
//    
//        	 WebDriver driver = new FirefoxDriver();
//            //System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
            
            //create chrome instance
 
          //  driver = new ChromeDriver();
 
//            System.out.println("inside FF2");
//        	}catch (Exception e) {
//        		e.printStackTrace();
//        		
//        	}
        //}
       
        //Check if parameter passed as 'chrome'
 /*
        else if(browser.equalsIgnoreCase("chrome")){
 
            //set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
 
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 
            //create chrome instance
 
            driver = new ChromeDriver();
       
//     else if(browser.equalsIgnoreCase("ie")){
 
            //set path to IEdriver.exe You may need to download it from
 
     // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
 
     // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
 
//            System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_x64_2.42.0\\IEDriverServer.exe");
 
         
 

//            driver = new InternetExplorerDriver();
        }
 
        else{
 
            //If no browser passed throw exception
 
            throw new Exception("Browser is not correct");
 
        }
 */
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
//    }
 
     
 
    @Test
 
    public void testParameterWithXML() throws InterruptedException{
 
        driver.get("http://192.168.3.16:201/");
 
        //Find user name
 
        WebElement userName = driver.findElement(By.name("txtUsername"));
 
        //Fill user name
        Thread.sleep(10000);
        userName.sendKeys("vasanthica");
 
        //Find password
 
        WebElement password = driver.findElement(By.name("txtPassword"));
 
        //Fill password
 
        password.sendKeys("dsrc1234");
        driver.findElement(By.id("btnSignIn")).click();
                     
        driver.quit();

        
        
    }}

