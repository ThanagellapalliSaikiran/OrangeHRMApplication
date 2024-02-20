package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPrintData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream("./src/com/excel/sai.xlsx");

XSSFWorkbook workbook= new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Sheet1");
int row = sheet.getLastRowNum();
int column = sheet.getRow(0).getLastCellNum();
for(int index=0; index<=row; index++) {
	XSSFRow currentrowRow =sheet.getRow(index);
	for (int index1 =0 ;index1<column; index1++) {
		
		String value = currentrowRow.getCell(index1).toString();
		System.out.print(value+"  -  ");
		
	}
	System.out.println();
}

	}

}
