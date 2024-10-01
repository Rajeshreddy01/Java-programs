package numberPrograms;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int rem=0,sum=0,a = sc.nextInt();
		while(sum!=1 && sum!=4) { 
			sum=0;
			while(a>0) {
			rem = a%10;
			sum = sum + (rem*rem);
			a /=10;
		}
			a=sum;
		}
		if(sum==1)
			System.out.println("Happy number");
		else
			System.out.println("Unhappy number");
	}

}
