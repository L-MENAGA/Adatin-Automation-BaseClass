package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Img_Category {


public WebDriver driver;
 
@FindBy(xpath=("//img[@title='Faded Short Sleeve T-shirts']"))
private WebElement img_tshirt;

public Img_Category(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public WebElement getImg_Tshirt() {
	return img_tshirt;
}
 

}
