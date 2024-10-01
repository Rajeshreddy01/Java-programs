package numberPrograms;

import java.util.Scanner;

public class Xylem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        int temp,sum=0,num=0;
        	temp = a%10;
        	a /=10;
        	System.out.println(a);
        	while(a>9) {
        		num =a%10;
        		sum += num;
        		a /=10;
        	}
        	int x=temp+a;
        	System.out.println(sum);
        	if(x==sum)
        		System.out.println("xylem");
        	else
        		System.out.println("phloem");
	}

}
