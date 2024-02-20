package com.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	//@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		// Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/excel/sai.xlsx");

		// Identify the workBook in the File
		//@SuppressWarnings("resource")
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identify a Particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(0);

		// Identify a Particular Row of a Cell in the Row
		Cell testDataRowOfCell=testDataSheetRow.getCell(1);

		// Get the Test data from the Row Of Cell
		String testData=testDataRowOfCell.getStringCellValue();

		System.out.println(testData);

	}

}
