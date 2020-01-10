package inetbank.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import inetbank.pageobject.Loginpage;






public class Tclogintest001 extends Baseclass {
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginTest() {
Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
}

}
