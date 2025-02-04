package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Ledpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/nav/div/div/ul/li[5]/a")
	WebElement carled;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/button")
	WebElement display;
	
	@FindBy(xpath="//*[@id=\"display-by-selector\"]/div/div/button[1]")
	WebElement page;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/button")
	WebElement sortby;
	
	@FindBy(xpath="//*[@id=\"sort-by-selector\"]/div/div/button[4]")
	WebElement alphabet;
	
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div/div/div[2]/div/div[2]/div[8]")
	WebElement item;
	
	
	public Ledpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void led() throws InterruptedException {
		carled.click();
		Thread.sleep(3000);
		
		display.click();
		
		page.click();
		Thread.sleep(3000);
		
		sortby.click();
		
		alphabet.click();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", item);
		item.click();
	}
	
}
