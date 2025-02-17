package Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class search {
	WebDriver driver;
	
	public search(WebDriver driver){
		this.driver=driver;
	}
	
	//locator
	By search1 = By.xpath("//input[@placeholder='Search']");
	By click = By.cssSelector("[class=\"btn btn-default btn-lg\"]");
	By category = By.xpath("//select[@name='category_id']");
	By checkBox1 = By.xpath("//input[@name='sub_category']");
	By checkBox2 = By.xpath("//input[@id='description']");
	By search2 = By.xpath("//input[@id='button-search']");
	By grid = By.xpath("//i[@class='fa fa-th']");
	By high = By.xpath("//select[@id='input-sort']");
	By price = By.xpath("//select[@id='input-limit']");
	
	
	
	public void searchItem(String sa) {
		driver.findElement(search1).sendKeys(sa);
	}
	
	public void clickSearch() {
		driver.findElement(click).click();
	}
	
	public void category() {
		driver.findElement(category);
	}
	
	void checkBo1() {
		WebElement desctop = driver.findElement(category);
		Select select = new Select(desctop);
		select.selectByIndex(3);
	}
	
	
	public void checkbox1() {
		driver.findElement(checkBox1).click();
	}
	public void checkbox2() {
		driver.findElement(checkBox2).click();
	}
	
	public void search2() {
		driver.findElement(search2).click();
	}
	
	public void grid() {
		driver.findElement(grid).click();
	}
	
	public void high() {
		WebElement highTOLow = driver.findElement(high);
		Select select = new Select(highTOLow);
		select.selectByIndex(4);
	}
	
	public void low() {
		WebElement Low = driver.findElement(high);
		Select select = new Select(Low);
		select.selectByIndex(3);
	}
	public void A_Z() {
		WebElement Low = driver.findElement(high);
		Select select = new Select(Low);
		select.selectByIndex(1);
	}
	public void z_a() {
		WebElement Low = driver.findElement(high);
		Select select = new Select(Low);
		select.selectByIndex(2);
	}
	
	void price() {
		WebElement pc = driver.findElement(price);
		Select select = new Select(pc);
		select.selectByIndex(3);
	}
}
