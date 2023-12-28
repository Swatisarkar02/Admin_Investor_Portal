package Test_Case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Column_Mapping {
	
	
	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://ip.reyanarth.com/ipadmin/#/login");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

        

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

        

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  

        driver.findElement(By.xpath("//a[@class='nav-link nav-group-toggle ng-tns-c56-4']")).click();
        
        driver.findElement(By.xpath("//a[@href='#/columnmapping']")).click();
        
        Select dM0 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
        dM0.selectByVisibleText(" Auto_Account_2 ");
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM1 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM1.selectByVisibleText(" integer01 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Report_Id");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Report_Id");
        driver.findElement(By.xpath("//input[@formcontrolname='is_key']")).click();
        //Checkbox
        //driver.findElement(By.xpath("//input[@formcontrolname='is_key']")).click();
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM2 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM2.selectByVisibleText(" integer02 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("S.No.");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("S.No.");
        driver.findElement(By.xpath("//input[@formcontrolname='is_key']")).click();
        //Checkbox
      //driver.findElement(By.xpath("//input[@formcontrolname='is_key']")).click();
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
         
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM3 = new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM3.selectByVisibleText(" date01 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Date");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Date");
        
                
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM4= new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM4.selectByVisibleText(" text01 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Test Case");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Test Case");
        
             
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
                
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM5= new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM5.selectByVisibleText(" text02 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Action");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Action");
        
                
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
                
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM6= new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM6.selectByVisibleText(" text03 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Expected Outcome");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Expected Outcome");
        
               
        //driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        
        Select dM7= new Select (driver.findElement(By.xpath("//select[@formcontrolname='column_name']")));
        dM7.selectByVisibleText(" text04 ");
        
        driver.findElement(By.xpath("//input[@formcontrolname='report_id']")).sendKeys("REPINVAUTO");
        driver.findElement(By.xpath("//input[@formcontrolname='label_en']")).sendKeys("Actual Outcome");
        driver.findElement(By.xpath("//input[@formcontrolname='label_lcl']")).sendKeys("Actual Outcome");
        
                
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        driver.findElement(By.xpath("//button[@class='btn btn-dark btn-primary']")).click();
        
        
        driver.quit(); 
        
        
	}


}
