package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staff_Page {
	
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
        
        driver.findElement(By.xpath("//a[@href='#/admin']")).click();
        
        Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM0.selectByVisibleText(" Auto_Account_2 ");
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        driver.findElement(By.xpath("//input[@formcontrolname='portal_login_id']")).sendKeys("Auto_Staff_2");
        driver.findElement(By.xpath("//input[@formcontrolname='portal_pwd']")).sendKeys("Auto123");
        Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='salutation_code']")));
        dMl.selectByVisibleText(" Mr ");
        driver.findElement(By.xpath("//input[@formcontrolname='first_name_en']")).sendKeys("Auto_Satff");
        driver.findElement(By.xpath("//input[@formcontrolname='middle_name_en']")).sendKeys("S1");
        driver.findElement(By.xpath("//input[@formcontrolname='last_name_en']")).sendKeys("S2");
        
        driver.findElement(By.xpath("//input[@formcontrolname='first_name_lcl']")).sendKeys("Auto_Satff");
        driver.findElement(By.xpath("//input[@formcontrolname='middle_name_lcl']")).sendKeys("S1");
        driver.findElement(By.xpath("//input[@formcontrolname='last_name_lcl']")).sendKeys("S2");
        Select dM2 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='gender_code']")));
        dM2.selectByVisibleText(" Male ");
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("sssarkartest@reyan.co.in");
        driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("8574830629");
        Select dM3 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='department']")));
        dM3.selectByVisibleText("  Testing ");
        Select dM4 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='designation']")));
        dM4.selectByVisibleText("   Programmer ");
        Select dM5 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='fk_adm_portal_account']")));
        dM5.selectByVisibleText(" Auto_Account_1 ");
        Select dM6 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='user_role']")));
        dM6.selectByVisibleText("  Admin ");
        Select dM7 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
        dM7.selectByVisibleText("  Work ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Auto_Address_1");
        driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Auto_City");
        driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("124585");
        driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("Auto_Dist");
        driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Auto_State");
        driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("Auto_Country");
        driver.findElement(By.xpath("//input[@formcontrolname='fax']")).sendKeys("Auto_Fax");
        driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("251489");
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        Select dM8 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM8.selectByVisibleText(" Auto_Account_1 ");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.quit(); 
        

	}
}
