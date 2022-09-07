package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   driver.get(" https://www.leafground.com/alert.xhtml");
	   driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
	   Alert alert = driver.switchTo().alert();
	   alert.sendKeys("Manjula");
	   alert.accept();
	   String text = driver.findElement(By.id("confirm_result")).getText();
	   System.out.println(text);
	  
	}

}
