import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	private FileInputStream fis;
	private XSSFWorkbook wb;
	private XSSFSheet sheet;

	public ReadExcel(int exlSheet, File src) throws Exception {
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(exlSheet);

	}

	public String getData(int row, int column) throws Exception {
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
