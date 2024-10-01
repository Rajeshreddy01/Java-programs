package statements;

public class Looping {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println("ok");
			i++;
		}
		
		int j=2;
		do {
			System.out.println("not ok");
			j++;
		}while(j<=10);
		
		for(int k=1;k<=5;k++) {
			System.out.println(k);
		}
	}

}
