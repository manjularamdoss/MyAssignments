package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/*
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		
		driver.get("http://leaftaps.com/opentaps/control/main");//1	Launch the browser
        driver.findElement(By.id("username")).sendKeys("demosalesManager");//2	Enter the username
        driver.findElement(By.id("password")).sendKeys("crmsfa");//3 Enter the password
        driver.findElement(By.className("decorativeSubmit")).click();//4	Click Login
        driver.findElement(By.linkText("CRM/SFA")).click();//5	Click crm/sfa link
        driver.findElement(By.linkText("Leads")).click();//6	Click Leads link
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//7 Click Find leads
        driver.findElement(By.xpath("//a[@class='x-tab-right']//span[text()='Phone']")).click();//8	Click on Phone
        driver.findElement(By.name("phoneNumber")).sendKeys("0123456789");//9	Enter phone number
        driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Search']")).click();//10	Click find leads button
        
        
	}

}
