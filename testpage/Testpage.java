package testpage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basepage.Basepage;
import page.Addresspage;
import page.Cartpage;
import page.Homepage;
import page.Ledpage;
import page.Loginpage;
import page.Logoutpage;
import page.Productdetail;
import page.Productpage;
import page.Searchpage;


public class Testpage extends Basepage{

	@Test(priority = 0)
	public void logintest() throws InterruptedException
	{
		Loginpage lp=new Loginpage(driver);
	
		lp.account();
	}
	
	@Test(priority = 1)
	public void Hometest() throws InterruptedException {
		
		Homepage hp=new Homepage(driver);
		hp.home();
	}
	
	@Test(priority = 2)
	public void Producttest() throws InterruptedException {
		
		Productpage pg=new Productpage(driver);
		pg.product();
	}
	
	@Test(priority = 3)
	public void Ledtest() throws InterruptedException {
		
		Ledpage lg=new Ledpage(driver);
		lg.led();
	}
	
	@Test(priority = 4)
	public void detailtest() throws InterruptedException {
		Productdetail pd=new Productdetail(driver);
		pd.detail();
	}
	
	@Test(priority = 5)
	public void carttest() throws InterruptedException {
		Cartpage cp=new Cartpage(driver);
		cp.cart();
	}
	
	@Test(priority = 6)
	
	public void searchtest() throws InterruptedException {
		Searchpage sp=new Searchpage(driver);
		sp.search();
	}
	
	@Test(priority = 7)
	public void addresstest() throws InterruptedException {
		
		Addresspage ap=new Addresspage(driver);
		ap.address();
	}
	
	@Test(priority = 8)
	
	public void logouttest() throws InterruptedException {
		
		Logoutpage lop=new Logoutpage(driver);
		lop.logout();
	}
	
	@AfterTest
	public void atest() {
		 
		driver.quit();
	}
	
}