package Test_Case;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.data.Session; 
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Investor_User {
	
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwatiSarkar\\Downloads\\chromedriver_win32\\chromedriver.exe");

          
        WebDriver driver = new ChromeDriver();
        driver.get("https://ip.reyanarth.com/#/dashboard");  
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sssarkar@reyan.co.in");

        

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


        ((JavascriptExecutor)driver).executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        
        driver.get("https://outlook.office.com");
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement usernameField = driver.findElement(By.id("i0116"));
        usernameField.sendKeys("sssarkar@reyan.co.in");
        
        driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
        driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("Bug97765");
        
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(160));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
        
        loginButton.click();
        
        WebElement NoButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
        
        NoButton.click();
        
        Thread.sleep(5000);
        
        //driver.findElement(By.xpath("//div[@class='Xk9aW Z9nT9']")).click();
        
        //driver.findElement(By.xpath("//span[@class='ms-ContextualMenu-itemText label-380']")).click();
        
        //List<WebElement> email = driver.findElements(By.xpath("//span[@id='avatar-5__initials']"));
        //email.get(0).click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(160));
        
        
        
        //List<WebElement> email = driver.findElements(By.xpath("//span[@class='XG5Jd JtO0E']"));
        //WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[tabindex='0']")));
        //email.click();
        
        
        WebElement otp1 = driver.findElement(By.xpath("//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div/div/div[3]/div[10]/div/span[1]"));

        otp1.click();
        
        Thread.sleep(5000);
        
        WebElement open_email = driver.findElement(By.xpath("//span[@title='mail@reyan.co.in']"));
        open_email.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/div/div"));

        String content = element.getText();
        Pattern pattern = Pattern.compile("\\b(\\d{6})\\b");
        Matcher matcher = pattern.matcher(content);
        String otp = null;
        if (matcher.find())
        {
            otp =  matcher.group(1);
           }

        else {
            System.out.println("opt not found");
        }
        
        Set<String> handles = driver.getWindowHandles();
        Iterator it = handles.iterator();
        String Parent_id = (String) it.next();
        String Child_Id = (String) it.next();
        driver.switchTo().window(Child_Id).close();

        driver.switchTo().window(Parent_id);

        WebElement otp_Field = driver.findElement(By.xpath("//input[@id='otp']"));
        otp_Field.sendKeys(otp);

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
     	}
			}



