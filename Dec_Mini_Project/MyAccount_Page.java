package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Page {


public WebDriver driver;

@FindBy(xpath=("(//a[@title='T-shirts'])[2]"))
private WebElement t_Shirt;


public MyAccount_Page(WebDriver driver2) {
	this. driver=driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getT_Shirt(){
return t_Shirt;
}
}

