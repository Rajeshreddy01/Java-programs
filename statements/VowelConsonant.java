package statements;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a alphabet");
		char a = sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') 
			System.out.println("vowel");
			else
				System.out.println("consonant");
	}

}
