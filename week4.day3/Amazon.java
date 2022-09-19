package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //************ Assignment 6:Amazon ***********
        driver.get("https://www.amazon.in/");//Load the uRL https://www.amazon.in/
        
        //search as oneplus 9 pro 
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        //Get the price of the first product
        Thread.sleep(3000);
        String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("Price of the first product : " + price);
        
        
        //Print the number of customer ratings for the first displayed product
        Thread.sleep(3000);
        String customerRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
        System.out.println("The number of customer ratings for the first displayed product : " +customerRating);
        
        //Mouse Hover on the stars
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement stars = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
        action.moveToElement(stars).click(stars).perform();
        
        //Get the percentage of ratings for the 5 star.
        Thread.sleep(5000);
        String percentage = driver.findElement(By.linkText("63%")).getText();
        System.out.println("The percentage of ratings for the 5 star : " +percentage);
        
        //Click the first text link of the first image
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> mobile = new ArrayList<String>(windowHandles);
		driver.switchTo().window(mobile.get(1));
        
        //Take a screen shot of the product displayed
        File source=driver.getScreenshotAs(OutputType.FILE);
    	File destination=new File("./Image/shot.jpg");
    	FileUtils.copyFile(source, destination);
    	Thread.sleep(3000);
    	

		//click to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		
		//click Cart button
		driver.findElement(By.xpath("(//input[@class='a-button-input'])//preceding::span[@id='attach-sidesheet-view-cart-button']")).click();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		//print cart subtotal
     	String cart = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]")).getText();	
		String repWhite =cart.replaceAll("\\s","");
		String s=repWhite.replaceAll(".0*$", "");
		
		System.out.println("Cart Subtotal : "+s);
		//String[] split=cart.split("\\s");
		//System.out.println(split.length);
		//Get the cart subtotal and verify if it is correct.
		if(price.equals(s)){
			System.out.println("Subtotal is same");
		}
		else
		{
			System.out.println("Subtotal is different");
	}
        driver.quit();
        
	}

}
