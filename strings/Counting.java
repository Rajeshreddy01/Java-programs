package strings;

public class Counting {

	public static void main(String[] args) {
		String s = "India@1234";
		int uc=0,lc=0,nc=0,sc=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') 
				uc++;
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				lc++;
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				nc++;
			else
				sc++;
		}
		System.out.println("capital letters : " +uc);
		System.out.println("small letters : "+lc);
		System.out.println("number count : "+nc);
		System.out.println("special characters : "+sc);
	}

}
