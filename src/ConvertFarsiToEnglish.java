import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class ConvertFarsiToEnglish {

	public static void main(String[] args) {
		try {

			File file = new File("out.txt"); // Your file
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			System.setOut(ps);

			String str = "آابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهی";
			char[] c = str.toCharArray();
			int[] val = new int[c.length];
			int i = 0;
			for (char cc : c) {
				val[i] = (int) cc;
				i++;
			}
			for (char cc : c) {
				System.out.print(cc + "   ");
			}
			System.out.println("");
			for (int num : val)
				System.out.print(num + " ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
