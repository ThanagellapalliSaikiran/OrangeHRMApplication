package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writet_To_TestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/excel/sai.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("sheet2");

		// create a particular Row in the Sheet
		XSSFRow newRow=testDataSheet.createRow(5);

		// Create a Particular Row of a Cell in the Row
		Cell newRowOfNewCell=newRow.createCell(6);

		// Sending the Test data into the New Row Of Cell Created
		newRowOfNewCell.setCellValue("Selenium");

		// The Excel File along with the WorkBook should be saved
		FileOutputStream testDataResultFile = new FileOutputStream("./src/com/excel/sai.xlsx");
		workBook.write(testDataResultFile);

	}

}
