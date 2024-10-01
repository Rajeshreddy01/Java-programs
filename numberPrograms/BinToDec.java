package numberPrograms;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int binary = sc.nextInt();
        int decimal =0,i=1;
        while(binary>0) {
        	int rem = binary%10;
        	decimal += (rem*i);
        	i *= 2;
        	binary /=10;
        }
        System.out.println(decimal);
	}

}
