package Test_Case;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		

	WebDriver driver = new ChromeDriver();
		
	driver.get("https://ip.reyanarth.com");

	
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testsuperadmin");

    
    
    

    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

    

    //driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}

}



