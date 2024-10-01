package numberPrograms;

import java.util.Scanner;

public class Prime1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		 for (int i = 2; i <= n; i++) {
	            boolean isPrime = true; // Assume the number is prime
	            
	            // Check for factors from 2 to the square root of i
	            for (int j = 2; j * j <= i; j++) {
	                if (i % j == 0) {
	                    isPrime = false; // i is divisible by j, so it's not prime
	                    break; // No need to check further
	                }
	            }
	            
	            // If isPrime is still true, print the number
	            if (isPrime) {
	                System.out.println(i);
	            }
		 }
	}

}