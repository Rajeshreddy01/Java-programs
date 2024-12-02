package strings;

public class ReverseString {
	public static void main(String[] args) {
		String s = "java is easy";
		int ws=0;
		for(int i=0;i<=s.length();i++) {
			if(i==s.length() || s.charAt(i)==' ') {
				for(int j=i-1;j>=ws;j--) {
					System.out.print(s.charAt(j));
				}
				if(i<s.length()) {
					System.out.print(" ");
				}
				ws=i+1;
			}
		}
	}
}
