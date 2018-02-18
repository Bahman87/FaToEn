
public class ConvertFarsiToEnglish {

	public static void main(String[] args) {

		try {
			ReadExcel reader = new ReadExcel(0, "C:\\Users\\bahma\\ExcelData\\TestData.xlsx");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 2; j++) {
					String str = reader.getData(i, j);
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
