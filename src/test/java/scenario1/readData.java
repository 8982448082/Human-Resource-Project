package scenario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class readData {
  @Test
  public void fileReadTest() throws IOException {
	  
	  File f1=new File(System.getProperty("user.dir") + "//dataSet//Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb==> sheet==> row==> cell==> data
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  // number of rows
	  int rows=wb.getSheet("userData").getPhysicalNumberOfRows();
	  
	  // number of cells
	  int cells=wb.getSheet("userData").getRow(0).getPhysicalNumberOfCells();
	  
	  // creating array
	  Object data[][]=new Object[rows-1][cells];    // 5 rows 2 cells as it skipped heading 
	  
	  //read data from file and keep it inside the array	
	  
	  for(int i=1; i<rows; i++)
	  {
		  for(int j=0; j<cells; j++)
		  {
			  data[i-1][j]=wb.getSheet("userData").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j] +   "    ");
		  }
		  System.out.println();   // next line
		   }
	  
	  
	  // single record
	  
	  /*String data=wb.getSheet("userData").getRow(2).getCell(0).getStringCellValue();
	  System.out.println(data);*/
	  
	  /*
	  XSSFSheet sheet1=wb.getSheet("userData");
	  XSSFRow row=sheet1.getRow(3);
	  XSSFCell cell=row.getCell(0);
	  String value=cell.getStringCellValue();
	  System.out.println(value);
	  */
	  
	  
	  
  }
}
