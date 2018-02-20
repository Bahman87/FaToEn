import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertFarsiToEnglish {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Usage: C:\\Program Folder>java -jar convertor.jar <myfile.xlsx> <column number> ");
			System.exit(0);
		}

		try {

		
			String path = args[0];
			int columnCount = Integer.parseInt(args[1]);
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			GetExcelSize rowNum = new GetExcelSize(0, file);
			ReadExcel reader = new ReadExcel(0, file);
			XSSFSheet sheet = wb.getSheetAt(1);
			for (int i = 0; i < rowNum.getSize() + 1; i++) {
				sheet.createRow(i);
				for (int j = 0; j < columnCount; j++) {
					String str = reader.getData(i, j);
					sheet.getRow(i).createCell(j).setCellValue(str);
				}	
			}
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
