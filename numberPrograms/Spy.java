package numberPrograms;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int rem,sum=0,prod=1, num = sc.nextInt();
        while(num>0) {
        	rem = num%10;
        	sum += rem;
        	prod *= rem;
        	num /=10;
        }
        if(sum==prod)
        	System.out.println("spy num");
        else
        	System.out.println("not a spy num");
	}

}
