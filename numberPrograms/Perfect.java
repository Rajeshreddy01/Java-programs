package numberPrograms;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int count=0, num = sc.nextInt();
        for(int i=1;i<=num/2;i++) {
        	if(num%i==0)
        		count +=i;
        }
        if(count==num)
        	System.out.println("perfect num");
        else
        	System.out.println("not an perfect num");
	}

}
