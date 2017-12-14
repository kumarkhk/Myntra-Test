package com.myntra.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	
	public static String fromProperties(String fileName, String key) throws Exception
	{
		String data=null;
		
		try
		{
			File f=new File("./test-config/"+fileName+".properties");
			FileInputStream fis=new FileInputStream(f);
			Properties p=new Properties();
			p.load(fis);
			data=(String)p.get(key);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static void fromExcel(String fileName, String sheetName, int row_index, int cell_index)
	{
		String data=null;
		
		try
		{
			File f=new File("./test-data/"+ fileName+".xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(f);
			Sheet sh=wb.getSheet(sheetName);
			Row r=sh.getRow(row_index);
			Cell cel=r.getCell(cell_index);
			data=cel.toString();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
