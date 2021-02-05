package com.Ecommerce.SkillRray.genericlibs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile implements AutoConstant
{

	public static String getPropertydata(String keys) throws FileNotFoundException, IOException
	{
	 Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath) );
		return p.getProperty(keys);
	}
	
}
