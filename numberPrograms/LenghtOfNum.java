package numberPrograms;

import java.util.Scanner;

public class LenghtOfNum {

	public static void main(String[] args) {
		int n,count=0,a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		n = sc.nextInt();
		while(n>0) {
			a = n%10;
			System.out.println(a);
			count++;
			n /=10;
		}
		System.out.println(count);
	}

}
