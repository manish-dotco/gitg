package inetbank.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import inetbank.utilities.Readconfig;

public class Baseclass {
	Readconfig rc=new Readconfig();
	public String baseurl=rc.getappurl();
	public String username=rc.getusername();
	public String password=rc.getpassword();
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	 public void setup(String br) {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",rc.getchrome());
	driver=new ChromeDriver();
	}
		else if(br.equals("firefox")){
			System.setProperty("webdriver.chrome.driver",rc.getfire());
			}
		driver.get(baseurl);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();	
	}
	
}
