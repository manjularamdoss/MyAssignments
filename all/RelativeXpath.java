package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        //login page
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
       driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       //Relative X-path for CRM/SFA
       driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
       driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manjula");
       driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mathiyalagan");
       driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
       String title=driver.getTitle();
       System.out.println(title);   
     }

}
