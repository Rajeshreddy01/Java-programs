package numberPrograms;

import java.util.Scanner;

public class GcdHcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++) {
        	if(num1%i==0 && num2%1==0)
        		gcd=i;
        }System.out.println(gcd);
	}

}
