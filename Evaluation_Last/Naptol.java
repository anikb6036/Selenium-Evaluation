package Evaluation_Last;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Naptol {
	WebDriver driver;
	
	public Naptol(WebDriver driver) {
		this.driver=driver;
	}
	
	//locater
	
	
	
	
	
	
	//search
	By serchBar = By.xpath("//input[@id='header_search_text']");
	By serchButton = By.xpath("//form[@id='header_search']//div[@class='search']//a[@href='javascript:autoSuggestion.headerSearch()']");
	
	
	
	//product
	By product = By.xpath("//img[@alt='I Kall Big Screen Mobile (K6300)']");
	By clor = By.xpath("//span[@class=\"selected\"]");
	By pincode = By.xpath("//input[@id='pincodeDeliveryId_0']");
	By clickChek = By.xpath("//span[normalize-space()='Check']");
	By goHome = By.xpath("//div[@class='clearfix']//ul[@class='logo']//a");
	
	
	
	
	
	
	
	public void searchFuntion(String search) {
		driver.findElement(serchBar).sendKeys(search);
	}
	
	public void searchClick() {
		driver.findElement(serchButton).click();
	}
	
	public void Clickproduct() {
		driver.findElement(product).click();
	}
	
	public void Clor() {
		driver.findElement(clor).click();
	}
	
	public void pin_code(String pin) {
		driver.findElement(pincode).sendKeys(pin);
	}
	
	public void check_pin() {
		driver.findElement(clickChek).click();
	}
	public void clickHome() {
		
		driver.findElement(goHome).click();
	}
	
	
}
