package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div[1]/div/div/div[2]/div[5]/button")
	WebElement selectmodel;
	
	@FindBy(id="filter-4-tag-vehiclemodel_alba")
	WebElement modelname;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/button")
	WebElement sortby;
	
	@FindBy(xpath="//*[@id=\"sort-by-selector\"]/div/div/button[4]")
	WebElement sortvalue;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div[2]/div/div/div/div[1]/div[3]/button[2]")
	WebElement viewby;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template\"]/section/div[1]/div[2]/div[2]/div/div/div/div[1]/div[3]/button[1]")
	WebElement returnviewby;
	
	public Productpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void product() throws InterruptedException {
		
		
		selectmodel.click();
		Thread.sleep(3000);
		
		modelname.click();
		Thread.sleep(3000);
		
		
		sortby.click();
		
		sortvalue.click();
		
		Thread.sleep(3000);
		
		viewby.click();
		Thread.sleep(3000);
		
		returnviewby.click();
		
	}
}
