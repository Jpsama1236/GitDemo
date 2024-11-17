package ecelfortesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatadrivern {
	
	public  ArrayList<String> getData(String testcasename) throws IOException {
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\Sama Jayaprakash\\Documents\\exceldata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();//access to all rows
				Row firstrow=rows.next();//access to first row
				Iterator<Cell> ce=firstrow.iterator();//access to cells in row
				int column = 0,k=0;
				while(ce.hasNext()) {
					Cell cellvalue=ce.next();//access to first cell
					
					if(cellvalue.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column=k;
					}
					k++;
				}
				
				
				System.out.println(column);
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
						
						Iterator<Cell>rv=r.cellIterator();
						while(rv.hasNext()) {
							Cell cv=rv.next();
							if(cv.getCellType()==CellType.STRING) {
							a.add(cv.getStringCellValue());
						}
							else {
								a.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
							}
						
					}
					
				}
			}
			
		}
		}

		return a;
	}

	public static void main(String[] args) throws IOException {
		
		
		
		// TODO Auto-generated method stub
		
		
	}

}
