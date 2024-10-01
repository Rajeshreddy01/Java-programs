package numberPrograms;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
//		for(int a=1;a<=10;a++) {
//			if(a%2==0)
//				System.out.println(a+ " is even number");
//			else
//				System.out.println(a+ " is odd number");
//		}
		String c = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
			 c = (a%2==0)? "even":"odd";
		System.out.println(c);
	}

}
