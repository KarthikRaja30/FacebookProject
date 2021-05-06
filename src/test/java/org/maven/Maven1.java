package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Maven1 {
public static void main(String[] args) throws IOException   {
	File file = new File("C:\\Users\\sivakumar\\eclipse-workspace\\Maven\\Excel Sheetl\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook w = new XSSFWorkbook();
	Sheet sheet = w.getSheet("maven");
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
			int type = cell.getCellType();
			if (type==1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
			if (type==0) {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				String of = String.valueOf(l);
				System.out.println(of);
				System.out.println(of);
				System.out.println(of);
				System.out.println(of);
				System.out.println(of);
				System.out.println(of);
			}
		}
		
	}
	
	}
}
