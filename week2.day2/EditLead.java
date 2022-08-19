package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       
		driver.get(" http://leaftaps.com/opentaps/control/main");// 1 Launch the browser
        driver.findElement(By.id("username")).sendKeys("demosalesManager");//2	Enter the username
        driver.findElement(By.id("password")).sendKeys("crmsfa");// 3	Enter the password
        driver.findElement(By.className("decorativeSubmit")).click();// 4	Click Login
        driver.findElement(By.linkText("CRM/SFA")).click();//5	Click crm/sfa link
        driver.findElement(By.linkText("Leads")).click();//6	Click Leads link
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();//7 Click Find leads
        driver.findElement(By.xpath("(//input[@name='firstName'])[3] ")).sendKeys("Manjula");//8 Enter first name
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//9 Click Find leads button
        driver.findElement(By.partialLinkText("Manjula")).click();//10 Click on first resulting lead
        String title=driver.getTitle();//11 Verify title of the page
        System.out.println(title); 
        driver.findElement(By.xpath("//a[text()='Edit']")).click();// 12 Click Edit
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName'] ")).sendKeys("Test Leaf");//13 Change the company name
        driver.findElement(By.xpath("//input[@value='Update']")).click();//14 Click Update
        String text= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();//Confirm the changed name appears
		System.out.println(text);
		//driver.close();//Close the browse
        
       
     }

}
