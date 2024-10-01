package numberPrograms;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();// sum of factorial is equal to actual number
		int sum=0,copy=num;
		while(num!=0) {
			int rem=num%10,fact=1;//here fact variable should be declared inside
			for(int i=1;i<=rem;i++) {// the while loop other wise it will add the fact value every time
				 fact=fact*i;
				System.out.println(fact);
			}
			sum=sum+fact;
			System.out.println(sum+"sum");
			num=num/10;
		}
		if(sum==copy)
			System.out.println("strong num");
		else
			System.out.println("not an strong num");
	}

}
