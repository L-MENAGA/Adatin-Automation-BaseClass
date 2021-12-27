package com.Dec_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	@FindBy(className="login")
	private WebElement signin_page;
	
	
	@FindBy(className="logout")
	private WebElement signout_page;
	
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
				
	}

	public WebElement getsignin_page() {
    	 return signin_page;
     }
	public WebElement getsignout_page() {
   	 return signout_page;
    }
	
     }
