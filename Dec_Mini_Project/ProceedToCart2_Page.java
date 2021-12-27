package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCart2_Page {
	
	public WebDriver driver;
	@FindBy(xpath=("//*[@id=\"center_column\"]/p[2]/a[1]/span"))
	private WebElement proceedToCart_2;
	
	public ProceedToCart2_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	public WebElement getProceedToCart_2() {
		return proceedToCart_2;
	}
	

}
