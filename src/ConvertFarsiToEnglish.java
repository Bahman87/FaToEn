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
/*
*			String strFa = "آابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهی";
*			char[] cFa = strFa.toCharArray();
*			int[] val = new int[cFa.length];
*			int i = 0;
*			for (char cc : cFa) {
*				System.out.print(cc + "   ");
*				System.out.print((int)cc + "   ");
*				val[i] = (int) cc;
*				i++;
*			}
*			System.out.println("");
*			for (int num : val)
*				System.out.print(num + " ");
*
*			System.out.println("");
*			
*			String strEn = "abcdefghijklmnopqrstuvwxyz";
*			char[] cEn = strEn.toCharArray();
*			int[] val2 = new int[cEn.length];
*			int j = 0;
*			for (char cc : cEn) {
*				val2[j] = (int) cc;
*				j++;
*			}
*			for (char cc : cEn) {
*				System.out.print(cc + "   ");
*			}
*			System.out.println("");
*			for (int num : val2)
*				System.out.print(num + " ");
*/
			String input ="اب پت";
			char[] arrayInput = input.toCharArray();
			System.out.println("");

			if(input !=null)
			{
				int k=0;
				while(k< arrayInput.length) {
				//replace a
				if((int)arrayInput[k]==1570 || (int)arrayInput[k]==1575||(int)arrayInput[k]==1593)
					arrayInput[k]='a';
				//replace b
				if((int)arrayInput[k]==1576)
					arrayInput[k] ='b';
				//replace c
				
				//replace d
				if((int)arrayInput[k]==1583)
					arrayInput[k]='d';
				//replace e
				
				//replace f
				if((int)arrayInput[k]==1601)
					arrayInput[k]='f';
				//replace g
				if((int)arrayInput[k]==1711)
					arrayInput[k]='g';
				//replace h
				if((int)arrayInput[k]==1581 ||(int)arrayInput[k]==1607)
				arrayInput[k]='h';
				//replace i
				
				//replace j
				if((int)arrayInput[k]==1580|| (int)arrayInput[k]==1688)
					arrayInput[k]='j';
				//replace k
				if((int)arrayInput[k]==1705 )
					arrayInput[k]='k';
				//replace l
				if((int)arrayInput[k]==1604)
					arrayInput[k]='l';
				//replace m
				if((int)arrayInput[k]==1605)
					arrayInput[k]='m';
				//replace n
				if((int)arrayInput[k]==1606)
					arrayInput[k]='n';
				//replace o
				
				//replace p
				if((int)arrayInput[k]==1662)
					arrayInput[k]='p';
				//replace q
				
				//replace r
				if((int)arrayInput[k]==1585)
					arrayInput[k]='r';
				//replace s
				if((int)arrayInput[k]==1579||(int)arrayInput[k]==1587||(int)arrayInput[k]==1589)
					arrayInput[k]='s';
				//replace t
				if((int)arrayInput[k]==1578||(int)arrayInput[k]==1591)
					arrayInput[k]='t';
				//replace u
				
				//replace x
				
				//replace v
				if((int)arrayInput[k]==1608)
					arrayInput[k]='v';
				//replace w
				
				//replace y
				if((int)arrayInput[k]==1740)
					arrayInput[k]='y';
				//replace z
				if((int)arrayInput[k]==1584 ||(int)arrayInput[k]==1586||(int)arrayInput[k]==1590||(int)arrayInput[k]==1592 )
					arrayInput[k]='z';
				k++;
				}
				StringBuffer strBuf = new StringBuffer();
				for (char c : arrayInput)
					strBuf.append(c);
			System.out.println(strBuf);	
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
