package numberPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int a = sc.nextInt();
		if(a>0) {
			if(a%4==0)
				System.out.println("leap year");
			else if(a%400!=0)
				System.out.println("not an leap year");
			else if(a%100==0)
				System.out.println("leap year");
			else
				System.out.println("not an leap year");
		}
	}

}
