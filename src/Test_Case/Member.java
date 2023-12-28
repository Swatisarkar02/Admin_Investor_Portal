package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Member {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ip.reyanarth.com/ipadmin/#/login");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

        

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

        

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
        
        driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-3']")).click();
                        
        driver.findElement(By.xpath("//a[@href='#/member']")).click();
        
        //Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        //dM0.selectByVisibleText(" Auto_Account_2 ");
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM1 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='fk_portal_admin']")));
        dM1.selectByVisibleText(" Test Test ");
        
        //Select dMl = new Select (driver.findElement(By.xpath("//select[@formcontrolname='fk_portal_admin']")));
        //dMl.selectByVisibleText(" Test  Test ");
        
      
        Select dM2 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='role']")));
        dM2.selectByVisibleText("Admin");
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.quit(); 
        
        
	}

	
}
