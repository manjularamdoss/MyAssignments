package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
       List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
       List<String> list=new ArrayList<String>();
       int rowSize = rowCount.size();
       System.out.println("Number of rows = "+ rowSize);
       
       for (String string : list) {
		
	}
         
      /* for (int i=1;i<=rowSize;i++) {
    	   String thirdColumn = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]/td[3]")).getText();
    	   Thread.sleep(3000);
    	   System.out.println(thirdColumn);// all Security names
       }*/
       
       //Ensure whether there are duplicate Security names
    		
	
	
	}
}
