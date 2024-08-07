package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.Baseclass;

public class HomePage {
	
	WebDriver driver = Baseclass.driver;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Products']")
	WebElement productsText;
	
	@FindBy(linkText="Sauce Labs Backpack")
	WebElement product;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement AddToCard;
	
	public void validateHomePage() {
		Assert.assertTrue(productsText.isDisplayed());
		
	}

	public void AddToCart(String itemName) {
		//driver.findElement(By.xpath("//div[text()='"+itemName+"']/ancestor::div[@class='inventory_item']//button")).click();
		product.click();
		AddToCard.click();
	}
	
	

	
}
