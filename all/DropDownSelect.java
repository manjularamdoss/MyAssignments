package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get(" https://www.leafground.com/select.xhtml");// 1 Launch the browser
       
       //Which is your favorite UI Automation tool?
       WebElement option=	driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
       Select option1=new Select(option);
       option1.selectByIndex(1);
         
	}

}
