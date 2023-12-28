package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_Component {
	
	
	
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ip.reyanarth.com/ipadmin/#/login");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

        

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

        

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  

        driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-2']")).click();
        
        driver.findElement(By.xpath("//a[@href='#/childcomponent']")).click();
        
        Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM0.selectByVisibleText(" Auto_Account_2 ");
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM1 = new Select (driver.findElement(By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-invalid']")));
        dM1.selectByVisibleText(" table ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='title_en']")).sendKeys("Auto_Report");
        driver.findElement(By.xpath("//input[@formcontrolname='title_lcl']")).sendKeys("Auto_Report");
        
        driver.findElement(By.xpath("//input[@formcontrolname='description_en']")).sendKeys("Description");
        driver.findElement(By.xpath("//input[@formcontrolname='description_lcl']")).sendKeys("Description");
        
        driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys("select integer01, text02, text03,text05, text06, text07,text08 from dt_report_data where text01='REPINV12345TESTCASE' and fk_adm_portal_account='11884b99-3c5c-472f-a084-2a14853e8634'  order by integer01");
      
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.quit(); 
        
        
	}
	

}
