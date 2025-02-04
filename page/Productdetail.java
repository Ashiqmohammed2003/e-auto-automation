package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetail {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-product-template\"]/section/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div/a[2]/div/img")
	WebElement secondpicture;
	
	@FindBy(xpath="//*[@id=\"shopify-section-product-template\"]/section/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/div/a[3]/div/img")
	WebElement thirdpicture;
	
	@FindBy(xpath="//*[@id=\"product_form_8688135504099\"]/div[1]/div[3]/div/div/button[2]")
	WebElement increment;
	
	@FindBy(xpath="//*[@id=\"product_form_8688135504099\"]/div[2]/button")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div/div[2]/div[3]/div/a")
	WebElement gotocart;
	
	
	
	public Productdetail(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void detail() throws InterruptedException {
		
		String title=driver.getTitle();
		
		{
			System.out.println(" TITLE IS : " +title);
		}
		Thread.sleep(3000);
		
		secondpicture.click();
		Thread.sleep(2000);
		
		thirdpicture.click();
		Thread.sleep(2000);
		
		increment.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", addtocart);
		addtocart.click();
		Thread.sleep(3000);
		
		
		gotocart.click();
		
		
	}
	
}

