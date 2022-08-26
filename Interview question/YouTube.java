package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       
		driver.get(" https://www.youtube.com/");
		
		WebElement WebElement = driver.findElement(By.xpath("//input[@id='search']"));
		WebElement.sendKeys("Manual testing full course");
		WebElement.sendKeys(Keys.ENTER);
		WebElement WebElement1 =driver.findElement(By.xpath("//yt-formatted-string[text()='QA Manual Testing Full Course for Beginners Part-1']"));
		WebElement1.click();
		WebElement WebElement2 =driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		WebElement2.click();
		
		

	}

}
