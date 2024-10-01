package numberPrograms;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		int n,sum=0,num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		n = sc.nextInt();
		while(n>0) {
			num = n%10;
			sum=sum+num;
			n=n/10;
		}
		System.out.println(sum);
	}

}
