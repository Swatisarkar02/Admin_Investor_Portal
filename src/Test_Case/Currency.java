package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Currency {
	
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ip.reyanarth.com/ipadmin/#/login");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

        

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

        

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
        
        driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-5']")).click();
                        
        driver.findElement(By.xpath("//a[@href='#/currency']")).click();
        
        Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM0.selectByVisibleText(" Auto_Account_2 ");
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        driver.findElement(By.xpath("//input[@formcontrolname='code']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("Test_Currency");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Test_Currency");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.quit(); 
        
	}
}
