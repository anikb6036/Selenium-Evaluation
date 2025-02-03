package Evaluation_Last;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mainPage {
	 WebDriver driver;
	 @Test(priority = 1)
	 public void set_up() {
		 driver= new ChromeDriver();
		 driver.get("https://www.naaptol.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	 }
	 
	 @Test(priority = 2)
	 public void Search() throws InterruptedException {
		 Naptol test = new Naptol(driver);
		 
		 test.searchFuntion("mobail");
		 test.searchClick();
		 test.Clickproduct();
		 test.Clor();
		 test.pin_code("743284");
		 test.check_pin();
		 test.clickHome();
	 }
	 
	 
	 @Test(priority = 10)
	 public void Driver_closs() throws InterruptedException {
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
}
