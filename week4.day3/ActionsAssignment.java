package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsAssignment {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable");
		
		//************** Assignment:8(Actions) ************
		
		//https://jqueryui.com/draggable
		driver.switchTo().frame(0);//switch to frame
		 
		 WebElement draggable=driver.findElement(By.id("draggable"));
		 Point location = draggable.getLocation();
		 int x = location.getX();
		 int y = location.getY();
         Actions action = new Actions(driver);//Action Class
         action.dragAndDropBy(draggable,x+50,y+20).perform();
      
        //https://jqueryui.com/droppable
         Set<String> windowHandles = driver.getWindowHandles();
 		 List<String> last=new ArrayList<String>(windowHandles);
         driver.switchTo().window(last.get(0));
        
         WebElement droppable = driver.findElement(By.linkText("Droppable"));
         action.moveToElement(droppable).click().perform();
         Thread.sleep(2000);
         driver.switchTo().frame(0);
	     WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
         WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
         action.dragAndDrop(drag, drop).perform();
		
         //https://jqueryui.com/resizable
         driver.switchTo().window(last.get(0));
         Thread.sleep(2000);
         WebElement resizable = driver.findElement(By.linkText("Resizable"));
         action.moveToElement(resizable).click().perform();
         Thread.sleep(2000);
         driver.switchTo().frame(0);
         WebElement resize= driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle ui-resizable-se')]"));
         action.dragAndDropBy(resize,125,80).perform();
         
	    //https://jqueryui.com/selectable
         Thread.sleep(2000);
         driver.switchTo().window(last.get(0));
        
         WebElement selectable = driver.findElement(By.linkText("Selectable"));
         selectable.click();
         
         Thread.sleep(2000);
         driver.switchTo().frame(0);
         Thread.sleep(2000);
         WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
         item3.click();
         Thread.sleep(2000);
         WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
         item7.click();
         
         Thread.sleep(2000);
         driver.quit();
        
	
	}

}
