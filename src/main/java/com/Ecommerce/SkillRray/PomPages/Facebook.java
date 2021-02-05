package com.Ecommerce.SkillRray.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(xpath = "( //button[@type='submit'])[2]")
	private WebElement fbbtn;

	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void likebtn() {
		fbbtn.click();
	}
}
