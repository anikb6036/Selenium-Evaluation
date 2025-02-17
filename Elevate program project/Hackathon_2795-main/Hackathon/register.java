package Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class register {
	
	WebDriver driver;
	
	public register(WebDriver driver){
		this.driver=driver;
	}
	
	
	//Locater
	By account = By.xpath("//i[@class='fa fa-user']");
	By click_rejister = By.xpath("//a[normalize-space()='Register']");
	By fastName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email1 = By.id("input-email");
	By ph = By.id("input-telephone");
	By password = By.id("input-password");
	By ConPassword = By.id("input-confirm");
	By Redio = By.xpath("//input[@name='agree']");
	
	//login
	By login = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");
	By id = By.xpath("//input[@id='input-email']");
	By pa = By.xpath("//input[@id='input-password']");
	By lcli = By.xpath("//input[@value='Login']");
	By err =By.xpath("(//div[@class='alert alert-danger alert-dismissible'])[1]");
	//
	public void account () {
		driver.findElement(account).click();
	}
	
	public void click_rejister () {
		driver.findElement(click_rejister).click();
	}
	
	public void fastName (String name ) {
		driver.findElement(fastName).sendKeys(name);
	}
	
	public void lastName (String lastname ) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	
	public void mail (String mail ) {
		driver.findElement(email1).sendKeys(mail);
	}
	
	public void ph (String phone ) {
		driver.findElement(ph).sendKeys(phone);
	}
	
	public void password (String password1  ) {
		driver.findElement(password).sendKeys(password1);
	}
	
	public void ConPassword (String password2  ) {
		driver.findElement(ConPassword).sendKeys(password2);
	}
	

	public void redio_button() {
		driver.findElement(Redio).click();
	}
	
	public void login () {
		driver.findElement(login).click();
	}
	public void id (String id1  ) {
		driver.findElement(id).sendKeys(id1);
	}
	
	public void pa (String pa1  ) {
		driver.findElement(pa).sendKeys(pa1);
	}
	
	public void lcli () {
		driver.findElement(lcli).click();
	}
	
	public void err() {
		WebElement err1 = driver.findElement(err);
		System.out.println(err1.getText());
	}
	
	public void clearEmail () {
		driver.findElement(id).clear();
	}
	
	public void clearPasword () {
		driver.findElement(pa).clear();
	}
}
