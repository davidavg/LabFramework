package com.general;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	//private static XSSFRow Row;
	
	//private static String FilePath = "src\\data\\testfile.xlsx";
	//private static String SheetName = "Sheet1";
	
	
	/*public static void main (String args[]) {
		
		System.out.println("Initializing...");
		try {
			myInputTest(FilePath, SheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Temrinating...");
	}*/
	
	public static Object[][] myInputTest(String FilePath, String SheetName) {
		
		String[][] tabArray = null;
		final int START_ROW = 1;
		final int START_COL = 0;
		
		
		System.out.println("Creating file object");
		File myExcel = new File(FilePath);
		
		try {
			System.out.println("Opening file");
			FileInputStream ExcelFile = new FileInputStream(myExcel);
						
			System.out.println("Create workbook");
			ExcelWBook = new XSSFWorkbook(ExcelFile);

			System.out.println("Create sheet");
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			int ci,cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			int totalCols = ExcelWSheet.getRow(0).getLastCellNum();

			tabArray=new String[totalRows][totalCols];

			ci=0;
			
			System.out.println("get content from the file");
			for (int i=START_ROW;i<=totalRows;i++, ci++) {           	   

				cj=0;

				for (int j=START_COL;j<totalCols;j++, cj++){

					tabArray[ci][cj]=getCellData(i,j);

					//System.out.println(tabArray[ci][cj]);  
				}
			}
			
			System.out.println("Closing file");
			ExcelFile.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tabArray;
	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;

			}catch (Exception e){

			System.out.println(e.getMessage());

			throw (e);

			}
	}
}
