package numberPrograms;

public class Factorial {

	public static void main(String[] args) {
		int n=5,fact=1;
		for(int a=1;a<=n;a++) {
			
			System.out.println(a+ " factorial is "+ (fact=fact*a));
		}
	}

}
