package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void read_Particular_Data() throws Throwable {

		File f = new File("C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\DATA_Driven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {
			
			String value = cell.getStringCellValue();
			
			System.out.println(value);
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
		
		    double cellValue = cell.getNumericCellValue();
		    
		    int value = (int) cellValue;
		    
		    System.out.println(value);
		    
		}
	
	}
	
	public static void all_Data()throws Throwable{
		
        File f = new File("C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\DATA_Driven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i=0; i< numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for(int j=0;j< numberOfCells; j++) {
			     
				Cell cell = row.getCell(j);
				
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(cellType.STRING)) {
				
				String cellValue = cell.getStringCellValue();
				
				System.out.println(cellValue);
				
			}
			
			else if (cellType.equals(cellType.NUMERIC)) {
				
				double cellValue = cell.getNumericCellValue();
				
				int value = (int) cellValue;
				
				System.out.println(value);
			}
			}
		}
	}
	
	public static void cell_data() throws Throwable {
		
        File f = new File("C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\DATA_Driven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		
		Sheet sheetAt = wb.getSheetAt(0);
		
        for (int i=0; i<6; i++) {
			
			Row row = sheetAt.getRow(i);
			
		    Cell cell = row.getCell(0);
				
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(cellType.STRING)) {
				
				String cellValue = cell.getStringCellValue();
				
				System.out.println(cellValue);
				
			}
			
			else if (cellType.equals(cellType.NUMERIC)) {
				
				double cellValue = cell.getNumericCellValue();
				
				int value = (int) cellValue;
				
				System.out.println(value);
			}
			}
		}
	
		
   public static void row_data() throws Throwable {
		
        File f = new File("C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\DATA_Driven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		
		Sheet sheetAt = wb.getSheetAt(0);
		
        for (int i=0; i<2; i++) {
			
			Row row = sheetAt.getRow(3);
			
		    Cell cell = row.getCell(i);
				
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(cellType.STRING)) {
				
				String cellValue = cell.getStringCellValue();
				
				System.out.println(cellValue);
				
			}
			
			else if (cellType.equals(cellType.NUMERIC)) {
				
				double cellValue = cell.getNumericCellValue();
				
				int value = (int) cellValue;
				
				System.out.println(value);
			}
			}
		}
	
  public static void main(String[] args)throws Throwable{
    	
	     read_Particular_Data();
    	 
    	 all_Data();
    	 
    	 cell_data();
    	 
    	 row_data();
     }

   }















