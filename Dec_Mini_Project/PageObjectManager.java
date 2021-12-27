package com.Dec_Mini_Project;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	private  Home_Page hp;
	private Login_Page login;
	private MyAccount_Page tshirts ;
	private Img_Category img ;
	private AddToCartF_Page cart1;
	private ProceedToCart_Page proceedCart1 ;
	private ProceedToCart2_Page  cart2 ;
	private ProceedToCart3_Page cart3;
	private ProceedToCart4_Page cart4;
	private Payment_Page checque;
	private ConfirmOrder_Page confirmation;
	private Last_Page scroll ;

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	public  Home_Page getInstancehp() {
		if(hp==null) {
			hp= new Home_Page(driver);
		}
		return hp;
	}
	public Login_Page getInstancelogin() {
		if(login==null) {
			login=  new Login_Page(driver);
		}
		return login;
	}
				
	public MyAccount_Page getInstancetshirts() {
		if(tshirts==null) {
			tshirts= new MyAccount_Page(driver);
		} 
		return tshirts;
	}
	
	public Img_Category  getInstancetimg() {
		if(img==null) {
			img= new Img_Category(driver);
		} 
		return img;
	} 
	public AddToCartF_Page  getInstancetcart1() {
		if(cart1==null) {
			cart1= new AddToCartF_Page(driver);
		} 
		return cart1;
	} 
	public ProceedToCart_Page getInstanceproceedCart1() {
		if(proceedCart1==null) {
			proceedCart1= new  ProceedToCart_Page(driver);
		} 
		return proceedCart1;
	}
	public ProceedToCart2_Page  getInstancecart2() {
		if(cart2==null) {
			cart2= new ProceedToCart2_Page(driver);
		} 
		return cart2;
	}
	public ProceedToCart3_Page getInstancetproceedcart3() {
		if(cart3==null) {
			cart3= new ProceedToCart3_Page(driver);
		} 
		return cart3;
	}
	public ProceedToCart4_Page getInstancetproceedcart4() {
		if(cart4==null) {
			cart4= new ProceedToCart4_Page(driver);
		} 
		return cart4;
	}
	public Payment_Page   getInstancetproceedchecque() {
		if(checque==null) {
			checque= new Payment_Page(driver);
		} 
		return checque;
	}
	public ConfirmOrder_Page   getInstancetproceedconfirmation() {
		if(confirmation==null) {
			confirmation= new ConfirmOrder_Page(driver);
		} 
		return confirmation;
	}
	public Last_Page   getInstancetproceedscroll() {
		if(scroll==null) {
			scroll= new Last_Page(driver);
		} 
		return scroll;
	} 
}
