package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder_Page {

	public WebDriver driver;

	@FindBy(xpath=("//*[@id=\"cart_navigation\"]/button/span"))
	private WebElement confirmorder;
	
	
		public ConfirmOrder_Page(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}
		
		public WebElement getConfirmOrder() {
			return confirmorder;
		}
}
