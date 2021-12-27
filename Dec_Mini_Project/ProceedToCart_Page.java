package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCart_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath= ("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"))
	private WebElement proceedCart1;
	
	public ProceedToCart_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getProceedToCart1() {
		return proceedCart1;
	}
	

	
	
	

}
