package numberPrograms;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int rem=0,num1=0,num = sc.nextInt();
        while(num>0) {
        	rem = num%10;
        	num1 = (num1*10) + rem;
        	num /= 10;
        }
        System.out.println(num1);
	}

}
