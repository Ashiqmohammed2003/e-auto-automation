package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addresspage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"account-popover\"]/div/div/a[2]")
	WebElement myaddress;
	
	@FindBy(xpath="//*[@id=\"flits-page-address\"]/div[4]/ul/li[1]/div/div[3]/div/button")
	WebElement edit;
	
	@FindBy(id="AddressAddress1New")
	WebElement address1;
	
	@FindBy(id="AddressAddress2New")
	WebElement address2;
	
	@FindBy(id="AddressCompanyNew")
	WebElement company;
	
	@FindBy(id="AddressZipNew")
	WebElement postalcode;
	
	@FindBy(id="AddressPhoneNew")
	WebElement phone;
	
	@FindBy(id="AddressCityNew")
	WebElement city;
	
	@FindBy(id="AddressProvinceNew")
	WebElement province;
	
	@FindBy(xpath="//*[@id=\"address_form_new\"]/div[7]/div/button[2]")
	WebElement save;
	
	public Addresspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void address() throws InterruptedException {
		
		myaddress.click();
		Thread.sleep(3000);
		
		edit.click();
		Thread.sleep(3000);
		
		address1.sendKeys("abscddvsvgsdgh");
		Thread.sleep(3000);
		
		address2.sendKeys("gsjhfdhdvhdv");
		Thread.sleep(3000);
		
		company.sendKeys("abcd");
		Thread.sleep(3000);
		
		postalcode.sendKeys("679338");
		Thread.sleep(3000);
		
		phone.sendKeys("7560963765");
		Thread.sleep(3000);
		
		city.sendKeys("malappuram");
		Thread.sleep(3000);
		
		Select slt=new Select(province);
		slt.selectByVisibleText("Kerala");
		Thread.sleep(3000);
		
		save.click();
		Thread.sleep(3000);
	}

}
