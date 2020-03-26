
	package com.pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class clickonlaptops {
		WebDriver driver;
		WebElement textbox;

		
		public void demoblaze_homePage()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://demoblaze.com/index.html");
			System.out.println(driver.getTitle());	
		}
		public void laptops() {
			driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
		}
		public void click_account()
		{
		WebElement a = driver.findElement(By.xpath("//*[@id=\"cat\"]")); 
		WebElement b = driver.findElement(By.xpath("//*[@id=\"itemc\"]"));
		
		Actions d= new Actions(driver);
		d.moveToElement(a);

		d.moveToElement(b).click().build().perform();
		}
		
	   }
	
	   