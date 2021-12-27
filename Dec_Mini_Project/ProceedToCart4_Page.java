package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCart4_Page {
	

	public WebDriver driver;
	@FindBy(id=("cgv"))
	private WebElement checkbox;
	
	@FindBy(xpath=("//*[@id=\"form\"]/p/button/span"))
	private WebElement proceedToCart4;
	
	public ProceedToCart4_Page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public WebElement getCheckBox() {
		return checkbox;
	}
	public WebElement getProceedToCart4() {
		return proceedToCart4;
	}
	
	
	

}
