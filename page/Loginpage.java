package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/header/div/div/h1/a/img")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[1]/div/a[2]")
	WebElement myaccount;
	
	@FindBy(name="customer[email]")
	WebElement email;
	
	@FindBy(name="customer[password]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"header_customer_login\"]/button")
	WebElement login;
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void account() throws InterruptedException {
		String actual=driver.getTitle();
		String expected="Shop Online for Bike Spare Parts & Accessories at Low Price";
		if(expected.equals(actual))
		{
			System.out.println(" TITLE VERIFED ");
		}else
		{
			System.out.println(" TITLE NOT VERIFIED ");
		}
		Thread.sleep(3000);
		
		
		if(logo.isDisplayed())
		{
			System.out.println(" LOGO IS DISPLAYED ");
		}else
		{
			System.out.println(" LOGO IS NOT DISPLAYED ");
		}
		Thread.sleep(3000);
		
		
		myaccount.click();
		Thread.sleep(3000);
		email.sendKeys("ashiqaq46@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("Ashiq@032003");
		Thread.sleep(5000);
		login.click();
	}
}