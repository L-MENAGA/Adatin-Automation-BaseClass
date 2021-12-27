package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Last_Page {

public WebDriver driver;
	
	@FindBy(xpath=("(//h1[@class='page-heading'])"))
			private WebElement lastpage;

	
	public Last_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
     public WebElement getLastPage() {
    	 return lastpage;
     }
}
