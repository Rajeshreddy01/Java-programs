package numberPrograms;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.println(c+" = "+ a +" + "+ b);
			a=b;
			b=c;
		}
		
	}

}
