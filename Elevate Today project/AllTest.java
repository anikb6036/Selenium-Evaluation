package retur_journy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class AllTest {
	WebDriver driver = null;
	
	//driver set-up
	@Before
	@org.testng.annotations.Test(priority = 0)
	public void Set_UP() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	//Login 
	@org.testng.annotations.Test(priority = 1)
	public void Login() {
		 SwagLads log = new SwagLads(driver);
		
		//userName
		log.username("standard_user");
		
		//Password
		log.password("secret_sauce");
		
		//Login Button
		log.loginButton();
		
		//Check Login
		log.LogoinVerify();
		
		//Check Product
		log.product1();
		log.product2();
		log.product3();
		log.product4();
		log.product5();
		log.product6();
		
		//check Add to cart Button
		log.checkCart1();
		log.checkCart2();
		log.checkCart3();
		log.checkCart4();
		log.checkCart5();
		log.checkCart6();
		
		//Verify Cart section
		log.clickCart();
		
		log.checkOut1();
		log.checkOut2();
		log.checkOut3();
		log.checkOut4();
		log.checkOut5();
		log.checkOut6();
		
		//remove product
		
		log.Remove1();
		log.Remove2();
		log.Remove3();

		
		//checkOut
		log.checkoutButton();
		log.fasttname("anik");
		log.lastname("baidya");
		log.zipcoe("12334");
		log.continueButton();
		log.finish();
		
		//verify check out process 
		log.verifycheckout();
		
	}
	
	@Test(priority = 2)
	public void ebay() {
		ebay Ebay = new ebay(driver);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com/");
		
		Ebay.Search("phone");
		Ebay.button();
		Ebay.productVerify();
		driver.close();
	}
	
	
	
	
	
	@Test(priority = 3)
	public void orengeHrm() {
		orengeHRM hrm = new orengeHRM(driver);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		hrm.username("Admin");
		hrm.password("admin123");
		hrm.loginButton();
		hrm.verifyLogin();
		hrm.manu();
		hrm.clickLogout();
		hrm.verifylogou();
		
		driver.close();
	}
	
	
	
	
	
	@Test(priority = 10)
	public void driverClose() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
