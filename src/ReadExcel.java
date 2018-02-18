import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcel {
	public static void main(String[] args) {
		Workbook wb = WorkbookFactory.create(new File("MyExcel.xls"));
		Sheet s = wb.getSheetAt(0);

		// Get the 11th row, creating if not there
		Row r1 = s.getRow(10);
		if (r1 == null) r1 = s.createRow(10);

		// Get the 3rd column, creating if not there
		Cell c2 = r1.getCell(2, Row.CREATE_NULL_AS_BLANK);
		// Set a string to be the value
		c2.setCellValue("Hello, I'm the cell C10!");

		// Save
		FileOutputStream out = new FileOutputStream("New.xls");
		wb.write(out);
		out.close();
	}
}
