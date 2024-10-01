package numberPrograms;

import java.util.Scanner;

public class Niven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int rem,sum=0,num = sc.nextInt();
        int temp=num;
        while(num>0) {
        	rem = num % 10;
        	sum += rem;
        	num /=10;
        }
        if(temp%sum==0)
        	System.out.println("niven num");
        else
        	System.out.println("not an niven");
	}

}
