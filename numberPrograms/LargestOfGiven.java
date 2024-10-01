package numberPrograms;

import java.util.Scanner;

public class LargestOfGiven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		System.out.println("Enter d");
		int d = sc.nextInt();
		System.out.println("Enter e");
		int e = sc.nextInt();
		int large = a;
		if(b>large)
			large = b;
			//System.out.println(b +" b is big");
		if(c>large)
			large = c;
			//System.out.println(c +" c is big");
		if(d>large)
			large = d;
			//System.out.println(d +" d is big");
		if(e>large)
			large = e;
			//System.out.println(e +" e is big");
		System.out.println(large+" is largest num");
	}

}
