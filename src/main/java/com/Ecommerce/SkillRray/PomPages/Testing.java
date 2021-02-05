package com.Ecommerce.SkillRray.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {

	@FindBy(xpath = "(//a[text()='munit testing '])[2]")
	private WebElement munit;

	public Testing(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	public void munitcourse()
	{
		munit.click();
	}
}
