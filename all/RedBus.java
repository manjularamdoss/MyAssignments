package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	 
	    ChromeDriver driver = new ChromeDriver(option);
	    
	    // Load https://www.redbus.in/
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    // Type "Chennai" in the FROM text box
	    driver.findElement(By.id("src")).sendKeys("Chennai");
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    
	    // Type "Bangalore" in the TO text box
	    driver.findElement(By.id("dest")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	    
	    // Select tomorrow's date in the Date field
	    driver.findElement(By.id("onward_cal")).click();
	    driver.findElement(By.xpath("(//td[@class='wd day'])[1]")).click();
	    
	    // Click Search Buses
	    driver.findElement(By.id("search_btn")).click();
	    
	    //Print the number of buses shown as results (ex:104 Buses found)
	    Thread.sleep(3000);
       String noOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
      System.out.println("Number of buses : "+noOfBuses);
     
      //Choose SLEEPER in the left menu 
      Thread.sleep(3000);
      WebElement sleeperCheckBox = driver.findElement(By.xpath("//ul[@class='list-chkbox']/li[2]"));
      driver.executeScript("arguments[0].scrollIntoView();", sleeperCheckBox);
      sleeperCheckBox.click();
      
      //Print the name of the second resulting bus
      Thread.sleep(3000);
     String secondBus = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]")).getText();
     System.out.println("Second resulting bus : "+secondBus);
       
       
    
      //Click the VIEW SEATS of that bus
     Thread.sleep(3000);
    // WebElement viewSeats = driver.findElement(By.xpath("(//div[contains(@class,'button view-seats')])[2]"));
      //driver.executeScript("arguments[0].scrollIntoView();", viewSeats);
      //viewSeats.click();
     driver.findElement(By.xpath(("//i[@class='icon icon-close']"))).click();
   
      driver.findElement(By.xpath(("(//div[@class='button view-seats fr'])[2]"))).click();
      
      
      //Take screenshot and close browser
      Thread.sleep(3000);
      File source = driver.getScreenshotAs(OutputType.FILE);
      File dest=new File("./snap/redBus.png");
      FileUtils.copyFile(source, dest);
      driver.close();
         
}
}
