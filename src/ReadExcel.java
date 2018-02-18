import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File src= new File("C:\\Users\\bahma\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		wb.close();
	}

}
