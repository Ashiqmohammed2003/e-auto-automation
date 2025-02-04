package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/form/div[1]/div/div[1]/input")
	WebElement searchfield;
	
	@FindBy(xpath="//*[@id=\"shopify-section-search-template\"]/section/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div[6]")
	WebElement meter;
	
	@FindBy(xpath="//*[@id=\"product_form_7799568433379\"]/div[2]/button")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div/div[2]/div[2]/div/a")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/header/div/div/div[3]/div[1]/div/a[2]")
	WebElement myaccount;
	
	public Searchpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void search() throws InterruptedException {
		
		searchfield.sendKeys("fz speedometer");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
		Thread.sleep(3000);
		
	
		meter.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", cart);
		cart.click();
		Thread.sleep(3000);
		
		viewcart.click();
		Thread.sleep(3000);
		
		myaccount.click();
	}
}
