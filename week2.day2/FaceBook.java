package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		driver.get(" https://en-gb.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manjula");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mathiyalagan");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("manjulamanjula@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("manjulamanjula@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("testleaf@123");
      
         //select[@id='day']
		 WebElement day = driver.findElement(By.xpath("(//select[@id='day'])"));
	        //include the Select class with webelement
	     Select drop1=new Select(day);
	     drop1.selectByVisibleText("14");
	     
	     WebElement month = driver.findElement(By.xpath("(//select[@id='month'])"));
	        //include the Select class with webelement
	     Select drop2=new Select(month);
	     drop2.selectByValue("10");   
	     
	     WebElement year = driver.findElement(By.xpath("(//select[@id='year'])"));
	        //include the Select class with webelement
	     Select drop3=new Select(year);
	     drop3.selectByVisibleText("1990"); 
	     
	     driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	     driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
       //driver.close();
	}

}
