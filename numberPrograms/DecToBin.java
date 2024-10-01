package numberPrograms;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        int binary=0,i=1;
        	while(decimal>0) {
        		int rem = decimal%2;
        		binary += (rem*i);
        		i*=10;
        		decimal /=2;
        	}
        System.out.println(binary);
	}
       
}
