package week4.day1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {

	public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//input[@id='form:j_idt89:globalFilter']")).sendKeys("India");
        Thread.sleep(2000);
        //Step:1 Find the table and retreiving the data of 1row and 1 col
        String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td[1]")).getText();
        System.out.println(text);
        
        List<WebElement> rowCount = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
        int rsize = rowCount.size();
        System.out.println("Number of Rows"+rsize);
        for(int i=1;i<=rsize;i++) {
            String firstColValues = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[1]")).getText();
            System.out.println(firstColValues);
            
        }
	}

}
