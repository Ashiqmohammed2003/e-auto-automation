package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-cart-template\"]/section/div[2]/div/div/div[1]/div/div/table/tbody/tr/td[2]/div/button[1]")
	WebElement decrement;
	
	@FindBy(xpath="//*[@id=\"shopify-section-cart-template\"]/section/div[2]/div/div/div[1]/div/div/table/tbody/tr/td[2]/a")
	WebElement remove;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/nav/div/div/ul/li[3]/a")
	WebElement sparebycategory;
	
	@FindBy(xpath="//*[@id=\"desktop-menu-0-2\"]/div/div/div[1]/ul/li[3]/a")
	WebElement brakedrum;
	
	public Cartpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void cart() throws InterruptedException {
		
		decrement.click();
		Thread.sleep(3000);
		
		remove.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(sparebycategory);
		act.perform();
		Thread.sleep(3000);
		
		brakedrum.click();
		
	}

}
