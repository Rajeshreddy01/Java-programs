package statements;

public class Jumping {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.println(i);
		}
		for(int j=1;j<=5;j++) {
			if(j==3)
				break;
			System.out.println(j);
		}
	}

}
