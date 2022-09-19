package week4.day3;

import java.time.Duration;
import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get("https://www.chittorgarh.com/");// 1 Launch the browser
       
       //Click on stock market
       driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[3]")).click();
       
       //Click on NSE bulk Deals
       driver.findElement(By.xpath("//a[@href='/newportal/stock-nse-bulk-deals.asp']")).click();
       
       //Get all the Security names
       List<WebElement> rowcount = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		int rowsize=rowcount.size();
		System.out.println("Security names oiginal size : " + rowsize);
		System.out.println("*************** All Security Names ************");
		List<String>securityNames=new ArrayList<String>();
		for(int i=1;i<rowsize;i++)
		{
			
			String thirdColumnValues = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]/td[3]")).getText();
			
			securityNames.add(thirdColumnValues);	
		}
		System.out.println(securityNames);
		System.out.println("");
		
		//Ensure whether there are duplicate Security names
		Set<String>names=new LinkedHashSet<String>(securityNames);
		
		System.out.println(" ************** Security names without duplicates *********" );
		System.out.println(names);
		Thread.sleep(2000);
	    driver.quit();
	
	
	}
}

