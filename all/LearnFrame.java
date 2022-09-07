package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	}

}
/*driver.get("https://www.leafground.com/window.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

String parentWindow = driver.getWindowHandle();
System.out.println(parentWindow);
String Ptitle = driver.getTitle();    
System.out.println(Ptitle);
driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
//get the address of the all opened windows
Set<String> windowHandles = driver.getWindowHandles();
/*int size = windowHandles.size();
System.out.println(size);

for(String wh:windowHandles) {
  System.out.println(wh);                
}
//    convert set to list
List<String> switchTOWindow=new ArrayList<String>(windowHandles);
//switch to the required child window
driver.switchTo().window(switchTOWindow.get(1));
String title = driver.getTitle();    
System.out.println(title);
driver.findElement(By.xpath("//li[@role='menuitem']//a")).click();
driver.close();*/