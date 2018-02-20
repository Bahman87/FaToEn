import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelSize {
	
	private FileInputStream fis;
	private XSSFWorkbook wb;
	private XSSFSheet sheet;

	public GetExcelSize(int exlSheet,File src) throws Exception {

		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(exlSheet);
	}
	
	public int getSize() {
		int size =  sheet.getLastRowNum();
		return size;
	}
}
