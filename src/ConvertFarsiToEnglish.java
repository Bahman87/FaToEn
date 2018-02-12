import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Character.UnicodeBlock;

import com.sun.xml.internal.fastinfoset.util.ValueArray;

public class ConvertFarsiToEnglish {
	static String text;

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			text = reader.readLine();
			PrintWriter writer = new PrintWriter("the-file-name66.txt", "UTF-8");
			char[] txt = text.toCharArray();
			int[] val = new int[txt.length - 1];
			for (int i = 0; i < txt.length; i++) {
				val[i] = (int) txt[i];
				// writer.println(val[i]);
				System.out.println(val[i]);
			}

			// writer.print(UnicodeBlock.ARABIC_PRESENTATION_FORMS_A);
			writer.close();
		} catch (Exception e) {

		}
	}
}
