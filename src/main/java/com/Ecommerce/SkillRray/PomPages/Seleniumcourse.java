package com.Ecommerce.SkillRray.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumcourse {



	@FindBy(xpath="//a[text()=' Selenium']")
	private WebElement seleniumcourse;
	
	public WebElement getSeleniumcourse() {
		return seleniumcourse;
	}
	
	@FindBy(xpath="//span[text()='View']")
	private WebElement viewbtn;
	
	public Seleniumcourse(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void view()
	{
		viewbtn.click();
	}
}
