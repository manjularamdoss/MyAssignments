package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get(" https://html.com/tags/table/");// 1 Launch the browser
      
       //******** Assignment 2: **********
      // Get the count of number of rows
       List<WebElement>noOfRows=driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int rowsize=noOfRows.size();
		System.out.println("Number of rows : " + rowsize);
		
		//Get the count of number of columns
		
				List<WebElement>noOfColumns=driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
				int columnsize=noOfColumns.size();
				System.out.println("Number of columns : " + columnsize);
				Thread.sleep(2000);
				
	    //************* Assignment 3: ******************
		//You have to print the respective values based on given Library
		//(hint: if the library was absolute usage, then print all its value)
				String absoluteUsage=driver.findElement(By.xpath("//div[@class='render']//table/tbody/tr[2]")).getText();
				System.out.println("*********** Absolute Usage **********");
			    System.out.println(absoluteUsage);
			   driver.close();


	}

}
