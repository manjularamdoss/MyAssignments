package week4.day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// initialize driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.nykaa.com/");//Go to https://www.nykaa.com/
				
				//Mouseover on Brands 
				WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
				Actions builder = new Actions(driver);
				builder.moveToElement(brands).build().perform();
				
				//Search L'Oreal Paris
				WebElement search = driver.findElement(By.xpath("//input[@placeholder='search brands']"));
				search.sendKeys("L'Oreal Paris");
			
				//Click L'Oreal Paris
				Thread.sleep(3000);
				WebElement searchbrands = driver.findElement(By.xpath("//div[@class='css-ov2o3v']//a"));
				searchbrands.click();
				
				// Check the title contains L'Oreal Paris(Hint-GetTitle)
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				driver.findElement(By.className("sort-name")).click();//Click sort By
				
				//select customer top rated
				driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();
				driver.findElement(By.xpath("//span[text()='Category']")).click();  //Click Category and ->
				driver.findElement(By.xpath("//span[text()='Hair']")).click();//click Hair
				driver.findElement(By.xpath("//span[text()='Hair Care']")).click();//Click haircare->
				driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();//-->Shampoo
				driver.findElement(By.xpath("//span[text()='Concern']")).click();//Click->Concern->
				//-->Color Protection
				 Thread.sleep(2000);
				driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
				
				//check whether the Filter is applied with Shampoo
				boolean displayed = driver.findElement(By.xpath("//span[text()='Shampoo']")).isDisplayed();
				System.out.println("Filter is applied with Shampoo : " +displayed);
				
				//Click on L'Oreal Paris Colour Protect Shampoo
				driver.findElement(By.xpath("//div[text()='3 sizes']")).click();
				
				//GO to the new window 
				Set<String> windowHandles = driver.getWindowHandles();
				int size = windowHandles.size();
				System.out.println("Window size : " +size);//size of window
				//List<String> newWindow=new ArrayList<String>(windowHandles);
				 Thread.sleep(2000);
		        //driver.switchTo().window(newWindow.get());//new window
				
		        //and select size as 175ml
		        WebElement selectSize= driver.findElement(By.xpath("//span[@class='fill']"));
		        selectSize.click();
		        
		        //Print the MRP of the product
		        Thread.sleep(5000);
		        String mrp = driver.findElement(By.xpath("//span[@class='css-111z9ua']")).getText();
		        String replaceAll = mrp.replaceAll("\\D", "");
				int mrp1=Integer.parseInt(replaceAll);
		        System.out.println("MRP is : " +mrp1);
		        
		        //Click on ADD to BAG
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		        
		        // Go to Shopping Bag 
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//span[text()='1']")).click();
		        
		        //Print the Grand Total amount
		        Thread.sleep(5000);
		        driver.switchTo().frame(0);
		        String grandTotal1 = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
		        String replaceAll1 = grandTotal1.replaceAll("\\D", "");
				int grandTotal=Integer.parseInt(replaceAll1);
		        System.out.println("Grand total 1 is : " +grandTotal);
		        
		        //Click Proceed
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//span[@class='proceed-btn-text capitalize-uppercase-vernacular']")).click();
		        
		        //Click on Continue as Guest
		        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		        
		        // Check if this grand total is the same in step 14
		        Thread.sleep(2000);
				String grandTotal2 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
				String replaceAll2 = grandTotal2.replaceAll("\\D", "");
				int grandTotal3=Integer.parseInt(replaceAll2);
				System.out.println("Grand Total 2 : "+grandTotal3);
				
				if(grandTotal==grandTotal3){
					System.out.println("Grand total 1 and 2 is same");
					}
				else {
						System.out.println("Grand total 1 and 2 is different" );
					}
				
		        
		        // Close all windows
				driver.quit();
	}

}
