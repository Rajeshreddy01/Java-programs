package numberPrograms;

import java.util.Iterator;

public class AsciiValues {

	public static void main(String[] args) {
		for(char c='a';c<='z';c++) {
			int a = c;
			System.out.print(a+" ");
		}
		System.out.println();
			for(char e='A';e<='Z';e++) {
				int b = e;
				System.out.print(b+" ");
			}
			System.out.println();
			for(char i='0';i<'9';i++) {
				int d = i;
				System.out.print(d+" ");
			}
	}

}
