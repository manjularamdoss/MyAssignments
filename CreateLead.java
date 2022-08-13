package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximize window
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.findElement(By.id("username")).sendKeys("demosalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manjula");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathiyalagan");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();//close window
        }
}
