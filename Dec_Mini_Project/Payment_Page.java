package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	public WebDriver driver;
	@FindBy(xpath=("//a[@class='cheque']"))
	 private WebElement checque;
	
	

	
	public Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}




	public WebElement getCheque() {
		return checque;
	}
	

}
