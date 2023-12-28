package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Investor_Page {
	
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
                        
        driver.findElement(By.xpath("//a[@href='#/user']")).click();
        
        Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM0.selectByVisibleText(" Auto_Account_2 ");
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        driver.findElement(By.xpath("//input[@formcontrolname='portal_login_id']")).sendKeys("Auto_01_1");
        driver.findElement(By.xpath("//input[@formcontrolname='portal_pwd']")).sendKeys("12345678");
        
        Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='salutation_code']")));
        dMl.selectByVisibleText(" Mr ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='first_name_en']")).sendKeys("Auto_Investor");
        driver.findElement(By.xpath("//input[@formcontrolname='middle_name_en']")).sendKeys("I1");
        driver.findElement(By.xpath("//input[@formcontrolname='last_name_en']")).sendKeys("I2");
        
        driver.findElement(By.xpath("//input[@formcontrolname='first_name_lcl']")).sendKeys("Auto_Investor");
        driver.findElement(By.xpath("//input[@formcontrolname='middle_name_lcl']")).sendKeys("I1");
        driver.findElement(By.xpath("//input[@formcontrolname='last_name_lcl']")).sendKeys("I2");
        
        Select dM2 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='gender_code']")));
        dM2.selectByVisibleText(" Male ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("sssarkar@reyan.co.in");
        driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("8574830627");
        driver.findElement(By.xpath("//input[@formcontrolname='portfolio_id']")).sendKeys("Auto_Port_Id");
        
        Select dM3 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='portfolio_currency']")));
        dM3.selectByVisibleText(" INR ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='fk_portfolio_broker']")).sendKeys("Auto_Port_Br");
          
        
        driver.findElement(By.xpath("//input[@formcontrolname='portfolio_inception_date']")).sendKeys("02-03-2023");
        driver.findElement(By.xpath("//input[@formcontrolname='portfolio_closed_date']")).sendKeys("02-06-2023");
        driver.findElement(By.xpath("//input[@formcontrolname='portfolio_code']")).sendKeys("100014");
        driver.findElement(By.xpath("//input[@formcontrolname='fk_portfolio_rm']")).sendKeys("Test");
        
        
        Select dM4 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='type']")));
        dM4.selectByVisibleText(" Work ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='address1']")).sendKeys("Test_Address");
        driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Test_City");
        driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("251489");
        driver.findElement(By.xpath("//input[@formcontrolname='dist']")).sendKeys("Test_District");
        driver.findElement(By.xpath("//input[@formcontrolname='state']")).sendKeys("Test_State");
        driver.findElement(By.xpath("//input[@formcontrolname='country']")).sendKeys("Test_Country");
        driver.findElement(By.xpath("//input[@formcontrolname='fax']")).sendKeys("Test_Fax");
        driver.findElement(By.xpath("//input[@formcontrolname='building_no']")).sendKeys("251");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.quit();
        
	}

}
