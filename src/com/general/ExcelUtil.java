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
	
	/*private static String FilePath = "C:\\Users\\David Avalos\\Documents\\eclipse\\frameworkLabortory\\src\\data\\testfile.xlsx";
	private static String SheetName = "Sheet1";
	
	
	public static void main (String args[]) {
		
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
		
		System.out.println("Creating file object");
		File myExcel = new File(FilePath);
		
		try {
			System.out.println("Opening file");
			FileInputStream ExcelFile = new FileInputStream(myExcel);
						
			System.out.println("Create workbook");
			ExcelWBook = new XSSFWorkbook(ExcelFile);

			System.out.println("Create sheet");
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			int startRow = 1;
			int startCol = 0;
			int ci,cj;
			int totalRows = ExcelWSheet.getLastRowNum();

			// you can write a function as well to get Column count

			int totalCols = 2;

			tabArray=new String[totalRows][totalCols];

			ci=0;
			
			System.out.println("get content from the file");
			for (int i=startRow;i<=totalRows;i++, ci++) {           	   

				cj=0;

				for (int j=startCol;j<totalCols;j++, cj++){

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
