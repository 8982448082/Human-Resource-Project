package scenario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class customData {
	
	public XSSFWorkbook wb;
	
	@DataProvider(name="excelData")
	public Object[][]  testData()
	{
		File f1=new File(System.getProperty("user.dir") + "//dataSet//Data.xlsx");
		  FileInputStream fs;
		  
		  Object data[][]=null;
		  
		try {
			fs = new FileInputStream(f1);
			//wb==> sheet==> row==> cell==> data
			   wb=new XSSFWorkbook(fs);
			   
			// number of rows
				  int rows=wb.getSheet("userData").getPhysicalNumberOfRows();
				  
				  // number of cells
				  int cells=wb.getSheet("userData").getRow(0).getPhysicalNumberOfCells();
				  
				  // creating array
				  data=new Object[rows-1][cells];    // 5 rows 2 cells as it skipped heading 
				  
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
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		  
		  
		  
		  
	}

}
