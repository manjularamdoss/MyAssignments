package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get(" https://www.leafground.com/button.xhtml");// 1 Launch the browser
		
		//Click and Confirm title.
       driver.findElement(By.xpath("//span[text()='Click']")).click();
       String title=driver.getTitle();//11 Verify title of the page
       System.out.println(title); 
       driver.navigate().back();
       
       //Confirm if the button is disabled
       System.out.println("Button is Disabled " +driver.findElement(By.xpath("(//div[@class='card'])[2]")).isDisplayed());
       
       //Find the position of the Submit button
       System.out.println("Position is "+driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
       
       //Find the Save button color
       System.out.println("Button color " +driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
       
       //Find the height and width of this button
       System.out.println("Height is " +driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight());
       System.out.println("Width is " +driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth());
       
       //Mouse over and confirm the color changed
      
       
       //Click Image Button and Click on any hidden button
       driver.findElement(By.xpath("//span[text()='Image']")).click();
       
       //How many rounded buttons are there?
       
       
	}

}
