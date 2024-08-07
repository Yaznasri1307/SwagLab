package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.Baseclass;

public class Loginpage {
		
		WebDriver driver = Baseclass.driver;
		
		@FindBy(name = "user-name")
		WebElement UserName;
		
		@FindBy(id = "password")
		WebElement Password;
		
		@FindBy(id = "login-button")
		WebElement Login;
		
		@FindBy(xpath = "//h3[@data-test='error']")
		WebElement errorText;
		
		public Loginpage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void LoginFunction(String UserNameVal, String PwdVal) {
			
		
			UserName.sendKeys(UserNameVal);
			Password.sendKeys(PwdVal);
			Login.click();
			
		}
		public void ValidateErrorMsg(String ExpMsg) {
			
			String ActMsg = errorText.getText();
			Assert.assertEquals(ExpMsg, ActMsg);	
		}
		

}
