package WindowsHandling;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnData {
	public static void main(String[] args) throws IOException {
		
		String file = "./Test/TestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook (file);
		XSSFSheet Sheet = wb.getSheetAt(0);
		XSSFRow row = Sheet.getRow(1);
		row.getCell(0);
	}

}
