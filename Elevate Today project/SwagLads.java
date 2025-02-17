package retur_journy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLads {
	WebDriver driver;
	
	public  SwagLads(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//Locater
	By UserName = By.id("user-name");
	
	By Password = By.id("password");
	
	By LoginButton = By.id("login-button");
	
	By LoginVerify = By.cssSelector("[class=\"app_logo\"]");
	
	By cartButton = By.xpath("//a[@class='shopping_cart_link']");
	
	By CheckOutButton = By.xpath("//button[@id='checkout']");
	
	By FastName = By.xpath("//input[@id='first-name']");
	
	By LastName = By.xpath("//input[@id='last-name']");
	
	By ZipsCode = By.xpath("//input[@id='postal-code']");
	
	By Continue = By.xpath("//input[@id='continue']");
	
	By Finish = By.xpath("//button[@id='finish']");
	
	By VerifyCheckOut = By.xpath("//h2[normalize-space()='Thank you for your order!']");
	
	By BackHome = By.className("//button[@id='back-to-products']");
	
	By menu = By.xpath("//button[@id='react-burger-menu-btn']");
	
	By LogoutButton = By.id("logout_sidebar_link");
	
	
	
	
	//product locater
	
	By Product1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	By Product2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	
	By Product3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	
	By Product4 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	
	By Product5 = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	
	By Product6 = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	
	//Cart section
	
	By checkrRemove1 = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	
	By checkrRemove2 = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	
	By checkrRemove3 = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
	
	By checkrRemove4 = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
	
	By checkrRemove5 = By.xpath("//button[@id='remove-sauce-labs-onesie']");
	
	By checkrRemove6 = By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']");
	
	
	
	
	//
	public void username(String U_name) {
		driver.findElement(UserName).sendKeys(U_name);
	}
	
	public void password(String Pword) {
		driver.findElement(Password).sendKeys(Pword);
	}
	
	public void loginButton() {
		driver.findElement(LoginButton).click();
	}
	
	public void LogoinVerify() {
		WebElement Lverify = driver.findElement(LoginVerify);
		if(Lverify.isDisplayed()) {
			System.out.println("Login Success Full");
		}else {
			System.out.println("Login Fail");
		}
	}
	
	//check products is displayed or Not
	public void product1() {
		WebElement Lverify = driver.findElement(Product1);
		if(Lverify.isDisplayed()) {
			System.out.println("Product1 is Display");
		}else {
			System.out.println("Product1 is Not Disply");
		}
	}
	
	public void product2() {
		WebElement Lverify = driver.findElement(Product2);
		if(Lverify.isDisplayed()) {
			System.out.println("Product2 is Display");
		}else {
			System.out.println("Product2 is Not Disply");
		}
	}
	
	public void product3() {
		WebElement Lverify = driver.findElement(Product3);
		if(Lverify.isDisplayed()) {
			System.out.println("Product3 is Display");
		}else {
			System.out.println("Product3 is Not Disply");
		}
	}
	
	public void product4() {
		WebElement Lverify = driver.findElement(Product4);
		if(Lverify.isDisplayed()) {
			System.out.println("Product4 is Display");
		}else {
			System.out.println("Product4 is Not Disply");
		}
	}
	
	public void product5() {
		WebElement Lverify = driver.findElement(Product5);
		if(Lverify.isDisplayed()) {
			System.out.println("Product5 is Display");
		}else {
			System.out.println("Product5 is Not Disply");
		}
	}
	
	public void product6() {
		WebElement Lverify = driver.findElement(Product6);
		if(Lverify.isDisplayed()) {
			System.out.println("Product6 is Display");
		}else {
			System.out.println("Product6 is Not Disply");
		}
	}
	
	//Check Add to cart
	public void checkCart1() {
		driver.findElement(Product1).click();
	}
	
	public void checkCart2() {
		driver.findElement(Product2).click();
	}
	
	public void checkCart3() {
		driver.findElement(Product3).click();
	}
	
	public void checkCart4() {
		driver.findElement(Product4).click();
	}
	
	public void checkCart5() {
		driver.findElement(Product5).click();
	}
	
	public void checkCart6() {
		driver.findElement(Product6).click();
	}
	
	public void clickCart() {
		driver.findElement(cartButton).click();
	}
	
	
	
	//verify checkOut
	public void checkOut1() {
		WebElement Lverify = driver.findElement(checkrRemove1);
		if(Lverify.isDisplayed()) {
			System.out.println("Product1 Success fully Add cart");
		}else {
			System.out.println("Product1 Not Add in cart ");
		}
	}
	
	public void checkOut2() {
		WebElement Lverify = driver.findElement(checkrRemove2);
		if(Lverify.isDisplayed()) {
			System.out.println("Product2 Success fully Add cart");
		}else {
			System.out.println("Product2 Not Add in cart ");
		}
	}
	
	public void checkOut3() {
		WebElement Lverify = driver.findElement(checkrRemove3);
		if(Lverify.isDisplayed()) {
			System.out.println("Product3 Success fully Add cart");
		}else {
			System.out.println("Product3 Not Add in cart ");
		}
	}
	
	public void checkOut4() {
		WebElement Lverify = driver.findElement(checkrRemove4);
		if(Lverify.isDisplayed()) {
			System.out.println("Product4 Success fully Add cart");
		}else {
			System.out.println("Product4 Not Add in cart ");
		}
	}
	
	public void checkOut5() {
		WebElement Lverify = driver.findElement(checkrRemove5);
		if(Lverify.isDisplayed()) {
			System.out.println("Product5 Success fully Add cart");
		}else {
			System.out.println("Product5 Not Add in cart ");
		}
	}
	
	public void checkOut6() {
		WebElement Lverify = driver.findElement(checkrRemove6);
		if(Lverify.isDisplayed()) {
			System.out.println("Product6 Success fully Add cart");
		}else {
			System.out.println("Product6 Not Add in cart ");
		}
	}
	
	
	
	//Remove Product
	public void Remove1() {
		driver.findElement(checkrRemove1).click();
	}
	
	public void Remove2() {
		driver.findElement(checkrRemove2).click();
	}
	
	public void Remove3() {
		driver.findElement(checkrRemove3).click();
	}
	

	
	//Check Out Button
	public void checkoutButton() {
		driver.findElement(CheckOutButton).click();
	}
	
	//Checkout process
	public void fasttname(String Fname) {
		driver.findElement(FastName).sendKeys(Fname);
	}
	
	public void lastname(String Lname) {
		driver.findElement(LastName).sendKeys(Lname);
	}
	
	public void zipcoe(String code) {
		driver.findElement(ZipsCode).sendKeys(code);
	}
	
	public void continueButton() {
		driver.findElement(Continue).click();
	}
	
	public void finish() {
		driver.findElement(Finish).click();
	}
	
	public void verifycheckout() {
		WebElement check = driver.findElement(VerifyCheckOut);
			System.out.println(check.getText());
	}
	
	//Logout Process
	public void homeButton() {
		driver.findElement(BackHome).click();
	}
	
	public void Menu() {
		driver.findElement(menu).click();
	}
	
	public void logoutButton() {
		driver.findElement(LogoutButton).click();
	}
	
	
}
