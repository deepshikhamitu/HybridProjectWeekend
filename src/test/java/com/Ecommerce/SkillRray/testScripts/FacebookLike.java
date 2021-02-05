package com.Ecommerce.SkillRray.testScripts;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRray.PomPages.DemoSRLogin;
import com.Ecommerce.SkillRray.PomPages.Facebook;
import com.Ecommerce.SkillRray.PomPages.Login;
import com.Ecommerce.SkillRray.PomPages.Munit;
import com.Ecommerce.SkillRray.genericlibs.BaseClass;
import com.Ecommerce.SkillRray.genericlibs.Utilities;

public class FacebookLike extends BaseClass {

	
	@Test
	public void facebookLike()
	{
		Login l=new Login(driver);
		l.gearsActions();
		
		Utilities.switchingtabs(driver);
		DemoSRLogin d=new DemoSRLogin(driver);
		Utilities.mouseHover(driver, d.getCoursebtn());
		d.seleniumtrainingcourse();
		
		Munit m=new Munit(driver);
		m.fbBtn();
		
		Facebook f=new Facebook(driver);
		f.likebtn();
	}
}
