package Hackathon;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.*;

public class Hackathon_Project {
	
	WebDriver driver=null;
	
	@Given("set up")
	@BeforeClass
	public void set_up() {
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Registration")
	public void Registration() {
		register rg = new register(driver); 
		
        rg.account();
        rg.click_rejister();
        rg.fastName("Anik");
        rg.lastName("Baidya");
        rg.mail("anik@gmail.com");
        rg.ph("892793");
        rg.password("anik123");
        rg.ConPassword("anik123");
        rg.redio_button();
	}

	@When("login")
	public void login() throws InterruptedException {
		register rg = new register(driver);
		//
        rg.account();
        rg.login();
        
        //invalid credential
        rg.id("anikb7@gmailcom");
        rg.pa("anik123");
        rg.lcli();
        rg.err();
        //Empty credential
        rg.clearEmail();
        rg.clearPasword();
        
        rg.id("");
        rg.pa("");
        rg.lcli();
        rg.err();
        //valid credential
        rg.id("anikb7960@gmail.com");
        rg.pa("anik123");
        rg.lcli();
        
        Thread.sleep(2000); 
	}

	@Then("cleck Product is Desply")
	public void cleck_Product_is_Desply() throws InterruptedException {
		 disply ds = new disply(driver);  
	        ds.dis();
	        ds.pro();   
	        ds.iphone();
	        ds.pc();
	        ds.camera();
	        Thread.sleep(2000);
	}
	
	@Then("checkOut product")
	public void check_out_product() throws InterruptedException {
		checkOut co = new checkOut(driver); 
        co.se("iphone");
        co.cli();
        co.ad();
        co.cout();
        co.cupo();
        co.cfild("HAIR20");
        co.addcupon();
        
        Thread.sleep(2000);
	}

	@Then("check search funtionality")
	public void check_search_funtionality() throws InterruptedException {
		search sea = new search(driver);
        sea.searchItem("phone");
        sea.clickSearch();
        sea.category();
        sea.checkbox1();
        sea.checkbox2();
        sea.search2();
        sea.grid();
        sea.high();
        sea.low();
        sea.A_Z();
        sea.z_a();
        sea.price();
        
          
	}
	@AfterClass
	@Then("quit the driver")
	public void quit_the_driver() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.quit();
	}


}
