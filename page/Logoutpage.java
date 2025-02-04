package page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/div[1]/div[3]/div[1]/div/div/a[7]")
	WebElement logout;
	
	String url="https://eauto.co.in/";
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[2]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div/div[2]/div[2]/div/a")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"shopify-section-cart-template\"]/section/div[2]/div/div/div[1]/div/div/table/tbody/tr/td[2]/a")
	WebElement remove;
	
	
	public Logoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException {
		
		logout.click();
		Thread.sleep(3000);
		
		try {
			URL ul=new URL(url);
			HttpURLConnection huc=(HttpURLConnection)ul.openConnection();
			int code=huc.getResponseCode();
			System.out.println(" THE RESPONSE CODE IS : " +code);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
		
		cart.click();
		Thread.sleep(3000);
		
		viewcart.click();
		Thread.sleep(3000);
		
		remove.click();
		Thread.sleep(3000);
		
	}
}
