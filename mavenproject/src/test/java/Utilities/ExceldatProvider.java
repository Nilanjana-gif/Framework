//package Utilities;
//
//import java.io.File;
//import java.io.FileInputStream;
//
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExceldatProvider {
//
//	XSSFWorkbook wb;
//	public ExceldatProvider(){
//	
//	File src= new File(".//Test Data//datasheet.xlsx");
//	
//	try {
//		FileInputStream fis = new FileInputStream(src);
//		wb= new XSSFWorkbook (fis);
//	} catch (Exception e) {
//		System.out.println("Unable to read Excel file data" + e.getMessage());
//	}
//	 
//	
//	}
//}
