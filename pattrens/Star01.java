package pattrens;

public class Star01 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print((i*j)%2 +" ");//(i+j)()
			}
			System.out.println();
		}
	}

}
