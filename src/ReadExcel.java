import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private FileInputStream fis;
	private XSSFWorkbook wb;
	private XSSFSheet sheet;
	DataFormatter formatter;

	public ReadExcel(int exlSheet, File src) throws Exception {
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(exlSheet);
		formatter = new DataFormatter();
	}

	public String getData(int row, int column) throws Exception {

		String data = " ";
		if (sheet.getRow(row) != null && sheet.getRow(row).getCell(column) != null)
			data = formatter.formatCellValue(sheet.getRow(row).getCell(column));
		else {
			if (sheet.getRow(row) != null) {
				sheet.getRow(row).createCell(column).setCellValue(" ");
			} else {
				sheet.createRow(row);
				sheet.getRow(row).createCell(column).setCellValue(" ");
			}
		}
		return data;
	}

}
