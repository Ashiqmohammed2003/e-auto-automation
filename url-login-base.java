package basepage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Basepage {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver ();
			driver.get("https://eauto.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
}
