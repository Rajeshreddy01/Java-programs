package numberPrograms;

import java.util.Scanner;

public class EvenCountOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int rem=0,even=0,odd=0,num = sc.nextInt();
		while(num>0) {
			rem = num%10;
			if(rem%2==0)
					even++;
				else
					odd++;
			num /= 10;
			}
		System.out.println("Evencount is : "+even);
		System.out.println("Oddcount is : "+odd);
	}

}
