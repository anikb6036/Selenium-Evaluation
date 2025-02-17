package retur_journy;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Static {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register
		//fast name
		driver.findElement(By.cssSelector("[placeholder=\"First Name\"]")).sendKeys("anik");
		
		//last name
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("baidya");
		
		//address
		driver.findElement(By.cssSelector("[rows=\"3\"]")).sendKeys("Kolkata pin-89289");
		
		//email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anik@gmail.com");
		
		//phone number
		driver.findElement(By.cssSelector("[type=\"tel\"]")).sendKeys("8927936036");
		
		//Gender
		driver.findElement(By.cssSelector("[value=\"Male\"]")).click();
		
		//Hobbies
		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("msdd")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='English']")).click();
		
		//Skills
		WebElement skill = driver.findElement(By.id("Skills"));
		Select select2 = new Select(skill);
		select2.selectByValue("Certifications");
		
		//
		driver.findElement(By.cssSelector("[role=\"combobox\"]")).click();
		driver.findElement(By.xpath("(//body)[1]")).click();
		
		//Date Of Birth
		
		
		driver.findElement(By.id("yearbox")).sendKeys("2015");
		
		driver.findElement(By.xpath("(//select[@placeholder='Month'])[1]")).sendKeys("March");
		
		driver.findElement(By.id("daybox")).sendKeys("3");
		
		driver.findElement(By.id("firstpassword")).sendKeys("anik123");
		
		driver.findElement(By.id("secondpassword")).sendKeys("anik123");
		
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\MASAI^\\Downloads\\sampleFile.jpeg");
		
		driver.findElement(By.id("submitbtn")).click();
		
		//switch new tab
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://demo.automationtesting.in/Static.html");
		
		 WebElement option1 = driver.findElement(By.xpath("//img[@id='angular']"));
		 
		 WebElement option2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		 
		 WebElement option3 = driver.findElement(By.xpath("//img[@id='node']"));
		 
		 WebElement dastination = driver.findElement(By.xpath("//div[@id='droparea']"));
		 
		 Actions action = new Actions(driver);
		 action.dragAndDrop(option1, dastination).build().perform();
		 
		 action.dragAndDrop(option2, dastination).build().perform();
		 
		 action.dragAndDrop(option3, dastination).build().perform();
		 
		
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
			
		 for(WebElement link: links) {
			 
			 @SuppressWarnings("deprecation")
			String url = link.getAttribute("href");
			 if(url==null || url.isEmpty() ) {
				 System.out.println();
				 continue;
			 }
			 
			 try {
				HttpURLConnection huc =(HttpURLConnection)(new URL(url).openConnection());
				huc.connect();
				if(huc.getResponseCode()>=400) {
					System.out.println(url+ " is broken");
				}else {
					System.out.println(url+ " is valid");
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
		
		 
		 
		 
		 
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
}
