package com.Ecommerce.SkillRray.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Ecommerce.SkillRray.PomPages.Login;
import com.Ecommerce.SkillRray.PomPages.Seleniumcourse;
import com.Ecommerce.SkillRray.PomPages.TakeThiscourse;
import com.Ecommerce.SkillRray.genericlibs.BaseClass;
import com.Ecommerce.SkillRray.genericlibs.Propertyfile;
import com.Ecommerce.SkillRray.genericlibs.Utilities;

public class TakingCourses extends BaseClass {

	@Test
	public void course() throws FileNotFoundException, IOException
	{
		Login l=new Login(driver);
		l.courseSearching(Propertyfile.getPropertydata("coursename"));
		Seleniumcourse s=new Seleniumcourse(driver);
		Utilities.mouseHover(driver, s.getSeleniumcourse());
		s.view();
		TakeThiscourse t=new TakeThiscourse(driver);
		t.takecourse();
		
	}
	
}
