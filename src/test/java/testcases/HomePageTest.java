package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Loginpage;

public class HomePageTest extends Baseclass{
	
	@Test
	public void TC01_AddToCartTest() {
		Loginpage lp = new Loginpage();
		HomePage hp = new HomePage();
		lp.LoginFunction("standard_user", "secret_sauce");
		hp.validateHomePage();
		hp.AddToCart("Sauce Labs Backpack");
	}

}