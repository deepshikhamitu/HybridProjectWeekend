package com.Ecommerce.SkillRray.genericlibs;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile implements AutoConstant {
	public static String getExceldata(String Sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(f);
		return wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
