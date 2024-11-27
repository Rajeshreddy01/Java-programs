package numberPrograms;

public class Repeat {

	public static void main(String[] args) {
		String s = "malaysia";
		char ch ='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(ch==c)
				count++;
		}
		System.out.println(count);
	}

}
