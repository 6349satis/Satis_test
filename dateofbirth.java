package SeleniumSection2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateofbirth 
{

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Monalisha kar\\All jar\\chromedriver_win32 (1)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://jqueryui.com/datepicker/");
           driver.switchTo().frame(0);
           driver.findElement(By.id("datepicker")).click();
           String month=driver.findElement(By.className("ui-datepicker-month")).getText();
           String year=driver.findElement(By.className("ui-datepicker-year")).getText();
           while(!(month.equals("June") && year.equals("1997")))
         {
        	   driver.findElement(By.xpath("//span[text()='Prev']")).click();
        	   month=driver.findElement(By.className("ui-datepicker-month")).getText();
        	   year=driver.findElement(By.className("ui-datepicker-year")).getText();
         }
         driver.findElement(By.linkText("12")).click();
	}

}
