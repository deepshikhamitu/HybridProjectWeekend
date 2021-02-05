package com.Ecommerce.SkillRray.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Munit {

	@FindBy(id = "add")
	private WebElement addbtn;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebook;

	public Munit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addtocart() {
		submit.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void fbBtn()
	{
		facebook.click();
	}
	

}
