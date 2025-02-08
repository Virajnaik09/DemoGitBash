package ganeric_utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
public String getExcelData(String SheetName,int rowNum,int cellNum) throws Throwable
{
	FileInputStream fis = new FileInputStream(IpathConstant.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet(SheetName);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	String orgName = cell.getStringCellValue();
	return orgName ;
	
	
}
public String ReadExcelDataUsingDataFormatter(String SheetName,int rowNum,int cellNum) throws Throwable
{
	FileInputStream fis = new FileInputStream(IpathConstant.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet(SheetName);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	DataFormatter data = new DataFormatter();
	String ExcelData = data.formatCellValue(cell);
	return ExcelData;
}

public Object[][] ReadExcelDataUsingDataProvider(String SheetName) throws Throwable
{
	FileInputStream fis = new FileInputStream(IpathConstant.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet(SheetName);
	int LastRow = sheet.getLastRowNum()+1;
	int LastCell = sheet.getRow(0).getLastCellNum();
	Object[][] obj = new Object[LastRow][LastCell];
	for(int i=0 ; i<LastRow ; i++)
	{
		for(int j=0 ; j<LastCell ; j++)
		{
			obj[i][j] = sheet.getRow(i).getCell(j).toString();
		}
	}
	return obj ;
	
}
}
