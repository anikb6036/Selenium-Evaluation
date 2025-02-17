package retur_journy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orengeHRM {
	WebDriver driver;

	public orengeHRM(WebDriver driver) {
		this.driver=driver;
	}

	//locater

	By UserName = By.xpath("//input[@placeholder='Username']");

	By Password = By.xpath("//input[@placeholder='Password']");

	By LoginButton = By.cssSelector("type=\"submit\"");

	By VerifyLogin = By.xpath("//h6[normalize-space()='Dashboard']");

	By Menu = By.xpath("//p[@class='oxd-userdropdown-name']");

	By LogoutButton = By.xpath("//a[normalize-space()='Logout']");

	By VerifyLogout = By.xpath("//img[@alt='company-branding']");


	//
	public void username (String name) {
		driver.findElement(UserName).sendKeys(name);

	}
	public void password(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}

	public void loginButton() {
		driver.findElement(LoginButton).click();
	}

	public void verifyLogin () {
		WebElement lVerify = driver.findElement(VerifyLogin);
		if(lVerify.isDisplayed()) {
			System.out.println("Login Success Fully");
		}else {
			System.out.println("Login Fail");
		}
	}
	public void manu () {
		driver.findElement(Menu).click();
	}
	public void clickLogout () {
		driver.findElement(LogoutButton).click();
	}
	public void verifylogou () {
		WebElement verify = driver.findElement(VerifyLogout);
		if(verify.isDisplayed()) {
			System.out.println("Logout Success Fully");
		}else {
			System.out.println("Logout Fail");
		}
	}
	

}
