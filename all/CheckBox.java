package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get(" https://www.leafground.com/checkbox.xhtml");// 1 Launch the browser
       
       //Basic Checkbox
       driver.findElement(By.xpath("//span[text()='Basic']")).click();
       
       //Notification
       driver.findElement(By.xpath("//span[text()='Ajax']")).click();
       
       //Choose your favorite language(s)
       driver.findElement(By.xpath("//label[text()='Java']")).click();
       
       //Tri State Checkbox

       
       //Toggle Switch
       
       //Verify if check box is disabled
       System.out.println("Button is Disabled " +driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed());
       
       //Select Multiple

       
       
       
       
       
	}

}
