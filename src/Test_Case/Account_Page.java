package Test_Case;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Page {
	public static void main(String[] args)  {
        

		 

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ip.reyanarth.com/ipadmin/#/login");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

        

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

        

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);     
        driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-1']")).click();
        
        driver.findElement(By.xpath("//a[@href='#/account']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
       
        driver.findElement(By.xpath("//input[@formcontrolname='org_name_en']")).sendKeys("Auto_Account_2");
        driver.findElement(By.xpath("//input[@formcontrolname='org_name_lcl']")).sendKeys("Auto_Account_2");
        driver.findElement(By.xpath("//input[@formcontrolname='domain_name']")).sendKeys("Auto_Domain");
        driver.findElement(By.xpath("//input[@formcontrolname='administrator']")).sendKeys("Auto_Administrator");
        
        Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='designation']")));
        dMl.selectByVisibleText(" Programmer ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='fk_default_profile']")).sendKeys("Auto_Profile");

        Select dM2 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='currency']")));
        dM2.selectByVisibleText(" INR ");
        
        Select dM3 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='date_format']")));
        dM3.selectByVisibleText(" dd-MMM-yyyy ");
        
        Select dM4 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
        dM4.selectByVisibleText(" Home ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Test automation");
        driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Test city");
        driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("100012");
        driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("Test District");
        driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Test state");
        
        Select dM5 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='code']")));
        dM5.selectByVisibleText(" +91 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@formcontrolname='fax']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("587");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.quit();           
        

}

}