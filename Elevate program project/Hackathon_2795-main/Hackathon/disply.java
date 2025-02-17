package Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class disply {
	WebDriver driver;
	
	public disply(WebDriver driver) {
		this.driver = driver;
	}
	
	//locator
	By displ = By.xpath("//a[normalize-space()='Qafox.com']");
	By product = By.xpath("//img[@title='MacBook']");
	By iphone = By.xpath("//img[@title='iPhone']");
	By pc = By.xpath("//img[@title='Apple Cinema 30\"']");
	By camera =By.xpath("//img[@title='Canon EOS 5D']");
	
	public void dis() {
		driver.findElement(displ).click();
	}
	
	public void pro() {
	
		WebElement prodc = driver.findElement(product);
		if(prodc.isDisplayed()) {
			System.out.println("Product is disply");
		}else {
			System.out.println("Product is Not disply");
		}
	}
	
	public void iphone() {
		
		WebElement prodc = driver.findElement(iphone);
		if(prodc.isDisplayed()) {
			System.out.println("iphone is disply");
		}else {
			System.out.println("iphone is Not disply");
		}
	}
	
	public void pc() {

		WebElement prodc = driver.findElement(pc);
		if(prodc.isDisplayed()) {
			System.out.println("pc is disply");
		}else {
			System.out.println("pc is Not disply");
		}
	}
	
	public void camera() {

		WebElement prodc = driver.findElement(camera);
		if(prodc.isDisplayed()) {
			System.out.println("camera is disply");
		}else {
			System.out.println("camera is Not disply");
		}
	}
}
