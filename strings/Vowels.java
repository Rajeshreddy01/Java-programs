package strings;

public class Vowels {

	public static void main(String[] args) {
		String s = "qwertyuioplkjhgfdsazxcvbnm";
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				//System.out.println(ch);
				v++;
		}
			else
				c++;
		}
		System.out.println(v);
		System.out.println(c);
	}

}
