package numberPrograms;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int rem=0,sum=0,num = sc.nextInt();
        int sn = num*num;
       int temp = num;
        while(sn>0) {
        	rem = sn%10;
        	sum += rem;
        	sn /= 10;
        }
        System.out.println(sum);
        if(temp%sum==0)
        	System.out.println("neon");
        else
        	System.out.println("not an neon");
	}

}
