package numberPrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();
		int count=0,temp=num,sum=0;
		while(num!=0) {
			num /=10;
			count++;
		}
		System.out.println(count);
		num=temp;
		while(num!=0) {
			int prod=1,rem;
			rem=num%10;
			for(int i=1;i<=count;i++) {
				prod = prod*rem;
			}
			sum=sum+prod;
			System.out.println(sum);
			num/=10;
		}
		if(sum==temp)
			System.out.println("armstrong");
		else
			System.out.println("not an armstrong");
	}

}
