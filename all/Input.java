package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       
		driver.get(" https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");// 1 Launch the browser
		
		//Type your name
		driver.findElement(By.xpath("//div[@class='col-12']//input ")).sendKeys("Manjula");
		
		//Append Country to this City
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Coimbatore");
		
		//Verify if text box is disabled
		System.out.println(driver.findElement(By.xpath("(//div[@class='col-12'])[3]")).isDisplayed());
		
		//Clear the typed text
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		
		//Retrieve the typed text
		String attribute= driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println(attribute);
		
		//Type email and Tab. Confirm control moved to next element
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("manjulam.2310@gmail.com");
		WebElement webElement = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		webElement.sendKeys(Keys.TAB);
		webElement.sendKeys(Keys.ENTER);
		
		//Type about yourself
		driver.findElement(By.xpath("//textarea")).sendKeys("Hi I am Manjula");
		
		//Text Editor
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("I am Manjula");
		
		//Just Press Enter and confirm error message*
		WebElement webElement1 = driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]//input[1]"));
		webElement1.sendKeys(Keys.ENTER);
		
		//Click and Confirm Label Position Changes
		driver.findElement(By.xpath("//span[@class='ui-float-label']//input[1]")).click();
		String text= driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(text);
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Manjula");
		//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-widget')]")).sendKeys("10/14/1990");
		String attribute1= driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).getAttribute("value");
		System.out.println(attribute1);
		
		//Type number and spin to confirm value changed
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).sendKeys("1");
		// To increase the value of this field
		WebElement textbox =driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/input"));
		textbox.sendKeys(Keys.ARROW_UP);
		
		// To decrease the value of this field
		WebElement textbox1 =driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/input"));
		textbox1.sendKeys(Keys.ARROW_DOWN);
		
		//Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("50");
		System.out.println("slider moves correctly");
		
		//Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard-input')]")).click();
		System.out.println("Keyboard appears");
		//Custom Toolbar
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Manjula",Keys.CONTROL,"a");
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		
}

}
