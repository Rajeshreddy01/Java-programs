package strings;

public class Missing {

	public static void main(String[] args) {
		String s = "developer";
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1)
				System.out.print(ch);
		}
	}

}
