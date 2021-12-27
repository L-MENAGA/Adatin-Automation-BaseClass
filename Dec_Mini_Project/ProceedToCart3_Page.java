package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCart3_Page {
	
	public WebDriver driver;
	@FindBy(xpath=("//*[@id=\"center_column\"]/form/p/button/span"))
	private WebElement proceedTOCart_3;
	
	public ProceedToCart3_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getProceedToCart3() {
		return proceedTOCart_3;
	}
	
	
}
