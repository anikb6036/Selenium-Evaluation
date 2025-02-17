package Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkOut {
	WebDriver driver;
	
	public checkOut(WebDriver driver){
	this.driver=driver;
	}
		//locator
		By sear = By.xpath("//input[@placeholder='Search']");
		By click = By.cssSelector("[class=\"btn btn-default btn-lg\"]");
		By add = By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']");
		By checkout = By.xpath("//a[@title='Checkout']//i[@class='fa fa-share']");
		By cupon = By.xpath("//a[normalize-space()='Use Coupon Code']");
		By cuponFild = By.xpath("//input[@id='input-coupon']");
		By addCupon = By.xpath("//input[@id='button-coupon']");
		
	
	
	public void se(String sea) {
		driver.findElement(sear).sendKeys("phone");
	}
	
	public void cli() {
		driver.findElement(click).click();
	}
	
	public void ad() {
		driver.findElement(add).click();
	}
	
	public void cout() {
		driver.findElement(checkout).click();
	}
	
	public void cupo() {
		driver.findElement(cupon).click();
	}
	
	public void cfild(String fild){
		driver.findElement(cuponFild).sendKeys("fild");
	}
	
	public void addcupon() {
		
	WebElement err=	driver.findElement(addCupon);
	err.click();
	String str = err.getText();
	System.out.println(str);
		
	}
	

}
