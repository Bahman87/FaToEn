
public class ConvertSeed {

	public String convert(String str) {
		if(str == null)
		{
			System.out.println("no input for convertor");
			System.exit(0);
		}
		char[] cellValue = str.toCharArray();
		StringBuffer convertedCellValue = new StringBuffer();

		for (char value : cellValue) {
			if ((int) value > 0 && (int) value < 255) {
				convertedCellValue.append(value);
			} else {
				if (value == 'آ' || value == 'ع' || value == 'ا') {
					value = 'a';
					convertedCellValue.append(value);
				}
				if (value == 'ب') {
					value = 'b';
					convertedCellValue.append(value);
				}
				if (value == 'پ') {
					value = 'p';
					convertedCellValue.append(value);
				}
				if (value == 'ت' || value == 'ط') {
					value = 't';
					convertedCellValue.append(value);
				}
				if (value == 'ث' || value == 'س' || value == 'ص') {
					value = 's';
					convertedCellValue.append(value);
				}
				if (value == 'ج') {
					value = 'j';
					convertedCellValue.append(value);
				}
				if (value == 'چ') {
					String temp = "ch";
					convertedCellValue.append(temp);
				}
				if (value == 'ه' || value == 'ح') {
					value = 'h';
					convertedCellValue.append(value);
				}
				if (value == 'خ') {
					String temp = "kh";
					convertedCellValue.append(temp);
				}
				if (value == 'د') {
					value = 'd';
					convertedCellValue.append(value);
				}
				if (value == 'ز' || value == 'ذ' || value == 'ظ') {
					value = 'z';
					convertedCellValue.append(value);
				}
				if (value == 'ر') {
					value = 'r';
					convertedCellValue.append(value);
				}
				if (value == 'ژ') {
					value = 'j';
					convertedCellValue.append(value);
				}
				if (value == 'ش') {
					String temp = "sh";
					convertedCellValue.append(temp);
				}
				if (value == 'غ') {
					String temp = "gh";
					convertedCellValue.append(temp);
				}
				if (value == 'ک') {
					value = 'k';
					convertedCellValue.append(value);
				}
				if (value == 'گ') {
					value = 'g';
					convertedCellValue.append(value);
				}
				if (value == 'ل') {
					value = 'l';
					convertedCellValue.append(value);
				}
				if (value == 'م') {
					value = 'm';
					convertedCellValue.append(value);
				}
				if (value == 'ن') {
					value = 'n';
					convertedCellValue.append(value);
				}
				if (value == ',') {
					value = 'v';
					convertedCellValue.append(value);
				}
				if (value == 'ی') {
					value = 'y';
					convertedCellValue.append(value);
				}
				if (value == 'ف') {
					String temp = "f";
					convertedCellValue.append(temp);
				}
			}
		}
		return convertedCellValue.toString();

	}

}
