package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
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
        
      WebElement Industry=  driver.findElement(By.id("createLeadForm_industryEnumId"));
      Select opt=new Select(Industry);
      opt.selectByIndex(3);
      
      WebElement Ownership=  driver.findElement(By.id("createLeadForm_ownershipEnumId"));
      Select opt1=new Select(Ownership);
      opt1.selectByVisibleText("S-Corporation");
      
      WebElement PreferredCurrency=  driver.findElement(By.id("createLeadForm_currencyUomId"));
      Select opt2=new Select (PreferredCurrency);
      opt2.selectByValue("ALL");
      
	}

}
