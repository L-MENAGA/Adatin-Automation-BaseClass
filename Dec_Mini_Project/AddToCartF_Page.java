package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartF_Page {
	

	 public WebDriver driver;
	
	@FindBy(xpath=("//button[@name='Submit']"))
	private WebElement addToCart_1;
	
	public AddToCartF_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getaddToCart_1(){
	return addToCart_1;
	}
	

}
