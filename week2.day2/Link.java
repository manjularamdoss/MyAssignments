package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       driver.get(" https://www.leafground.com/link.xhtml");// 1 Launch the browser
       
       //Take me to dashboard
       driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).click();
       driver.navigate().back();
       
        //Find my destination
       //Without clicking the link
       System.out.println("Without clicking me : "  +driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href"));
       
       
      /* List <WebElement> destination=driver.findElements(By.partialLinkText("Find the URL without clicking me."));
       for (WebElement link : destination) {
		System.out.println("Without clicking me : " +link.getAttribute("href"));	
	}*/
       
       
       //byclicking the link
       driver.findElement(By.partialLinkText("Find the URL without clicking me.")).click();
       String title=driver. getCurrentUrl();//11 Verify title of the page
       System.out.println("By clicking me : " +title);
       driver.navigate().back();
       
       //Am I broken link?
       System.out.println("yes you are broken link ---- " +driver.findElement(By.linkText("Broken?")).getAttribute("href"));
       
       //Duplicate Link
       
       
       //Count Links
       List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println("The number of links is "+ links.size());
       
       
       
       
       
       
	}
}
       
       
       
	

	
