package inetbank.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
WebDriver ldriver;

  public Loginpage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}

@FindBy(name="uid")
@CacheLookup
WebElement txtusername;

@FindBy(name="password")
@CacheLookup
WebElement txtpassword;



@FindBy(name="btnlogin")
@CacheLookup
WebElement btnLogin;

public void setUserName(String uname) {

	txtusername.sendKeys(uname);
}
public void setPassword(String pwd) {
	txtpassword.sendKeys(pwd);
}
public void clickSubmit() {
	btnLogin.click();
}






}
