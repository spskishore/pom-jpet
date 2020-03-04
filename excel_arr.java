package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_arr {

	
	
 static String filename="C:\\softwares\\data.xlsx";
 static String sheetname="Loginpet";
 
 public static String[][]testdata;
 public static int rowno,colno;

	public static void get_test_data(){
		testdata=new String[2][3];
		int c;
		String s=null,s1=null,s2=null;
	   for(rowno=0;rowno<=1;rowno++){
		   
		                        try{
			                          
		                       System.out.println("in get test data row: " +rowno);
		                               File f=new File(filename);
		                               FileInputStream fis = new FileInputStream(f);
			                           XSSFWorkbook wb = new XSSFWorkbook(fis);
			                           XSSFSheet sh = wb.getSheet(sheetname);
			                           XSSFRow r = sh.getRow(rowno);
			                           
			                           XSSFCell cell1 = r.getCell(0);
			                           testdata[rowno][0]=cell1.getStringCellValue();
			                           System.out.println(testdata[rowno][0]);
			                          
			                           
			                           XSSFCell cell2 = r.getCell(1);
			                           System.out.println(testdata[rowno][1]);
			                           testdata[rowno][1]=cell2.getStringCellValue();
			                           
			                           XSSFCell cell3 = r.getCell(2);
			                           System.out.println(testdata[rowno][2]);
			                           testdata[rowno][2]=cell3.getStringCellValue();
			                        
			                           
			                           
		                       }
		       catch(FileNotFoundException e)
		                { 
		    	          e.printStackTrace();
		                }
		        catch(IOException e)
		                { 
			               e.printStackTrace();
		                }
		
		
		
		
	          }
	
	
	
	}
}
