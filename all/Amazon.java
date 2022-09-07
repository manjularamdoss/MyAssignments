package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
	    driver.get("https://www.amazon.in/");
	       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
		//Type "Bags" in the Search box
		Thread.sleep(3000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	    
	    // Choose the third displayed item in the result (bags for boys)
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    //Print the total number of results (like 20000)
	    //1-48 of over 20,000 results for "bags for boys"
	    String total= driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
	  System.out.println(total);
	    
	  // Select the first 2 brands in the left menu
	    //(like American Tourister, Generic) 1-48 of over 3,000 results for "bags for travelling"
	  driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
	  driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
	  
	       
	       
	    //Confirm the results have got reduced (use step 05 for compare)
	    String reduce = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
	    System.out.println("Total number of results after selecting 2 brands : "+ reduce);
	    if (reduce.equals(total)) {
			System.out.println("Result got reduced");
		} else {
			System.out.println("Result not get reduced");
		}
	    //Choose New Arrivals (Sort)
	    driver.findElement(By.xpath("//img[@class='s-image']")).click();
	   
	    
	    //Print the first resulting bag info (name, discounted price)
	  
	    
	   
	    
	    // Confirm the color of the 'Deal of the day' is in kind of Red
	   // String dealOfThe = driver.findElement(By.xpath("//span[contains(@class,'text-white text-[.85em]')]")).getText();
	   // Click on the First Deal of the day
	// Confirm the price on previous and this page are same 
	  //Take screenshot and close
	    
	}

}
