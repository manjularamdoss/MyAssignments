package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/video.xhtml");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);//Action class
		
		Thread.sleep(2000);
		//play video
		WebElement play = driver.findElement(By.xpath("//video[@id='myvideo']"));
		action.moveToElement(play).click(play).build().perform();
		
		Thread.sleep(2000);
		//fullscreen the video
		WebElement fullScreen = driver.findElement(By.xpath("//video[@id='myvideo1']"));
		action.moveToElement(fullScreen).doubleClick(fullScreen).build().perform();
		
		
	}

}
