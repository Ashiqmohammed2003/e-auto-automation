package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"flits-page-orders\"]/div[2]/div[4]/a")
	WebElement shopnow;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/nav/div/div/ul/li[2]/a")
	WebElement sparebike;
	
	@FindBy(xpath="//*[@id=\"desktop-menu-0-1\"]/li[6]")
	WebElement bikebrand;
	
	@FindBy(id="block-5")
	WebElement fz;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void home() throws InterruptedException {
		shopnow.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(sparebike);
		act.perform();
		
		Thread.sleep(3000);
		
		bikebrand.click();
		Thread.sleep(3000);
		
		fz.click();
	}
}
