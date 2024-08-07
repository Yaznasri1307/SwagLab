package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;

public class LoginTest extends Baseclass {
	
	@Test
 	public void TC01_LoginSucessTest() {
		
		
		Loginpage lp = new Loginpage();
		HomePage hp = new HomePage();
		lp.LoginFunction("standard_user", "secret_sauce");
		hp.validateHomePage();
}
	@Test
	public void TC02_LoginFailureTest() {
		
		Loginpage lp = new Loginpage();
		lp.LoginFunction("abc@xyz.com", "Abcd@1234");
		lp.ValidateErrorMsg("Epic sadface: Username and password do not match any user in this service");
		
	}
	@Test
	public void TC03_LockedUserTest() {
		Loginpage lp = new Loginpage();
		lp.LoginFunction("locked_out_user", "secret_sauce");
		lp.ValidateErrorMsg("Epic sadface: Sorry, this user has been locked out.");
	}
	
	
	

}
