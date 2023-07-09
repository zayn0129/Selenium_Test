package com.edureka.HybridFramework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {private static XSSFSheet ExcelWSheet;
private static XSSFWorkbook ExcelWBook;
private static XSSFCell Cell;

public static void setExcelFile(String Path, String SheetName) throws Exception {
	FileInputStream ExcelFile = new FileInputStream(Path);
	ExcelWBook = new XSSFWorkbook(ExcelFile);
	ExcelWSheet = ExcelWBook.getSheet(SheetName);
	// TODO Auto-generated method stub

}

public static  String getCellData(int RowNum, int ColNum)throws Exception {
	Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	String cellData = Cell.getStringCellValue();
	return cellData;
	
	
	
}

}
