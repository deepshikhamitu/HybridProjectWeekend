package com.Ecommerce.SkillRray.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRray.PomPages.DemoSRLogin;
import com.Ecommerce.SkillRray.PomPages.Login;
import com.Ecommerce.SkillRray.PomPages.Munit;
import com.Ecommerce.SkillRray.PomPages.Testing;
import com.Ecommerce.SkillRray.genericlibs.BaseClass;
import com.Ecommerce.SkillRray.genericlibs.Propertyfile;
import com.Ecommerce.SkillRray.genericlibs.Utilities;

public class Addtocart extends BaseClass{

	@Test
	public void addingcart() throws FileNotFoundException, IOException
	{
		Login l=new Login(driver);
		l.gearsActions();
		/*
		Set<String> child = driver.getWindowHandles();	
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		
		*/
		
		Utilities.switchingtabs(driver);
		
		DemoSRLogin d=new DemoSRLogin(driver);
		Utilities.dropdown(d.getCourseadd(), Propertyfile.getPropertydata("courseadd"));
		
		Testing t=new Testing(driver);
		t.munitcourse();
		
		Munit m=new Munit(driver);
		Utilities.doubleClick(driver, m.getAddbtn());
		m.addtocart();
		Utilities.alertPopup(driver);
		}
	
	
}

