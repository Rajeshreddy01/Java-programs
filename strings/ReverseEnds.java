package strings;

public class ReverseEnds {

	public static void main(String[] args) {
		String s = "java is easy";
		String o = "";
		int we = s.length();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ' || i==0) {
				int ws=(s.charAt(i)==' ')?i+1:i;
				o=o+s.substring(ws,we);
				if(i>0) {
					o=o+" ";
				}
				we=i;
			}
		}
		System.out.println(o);
	}

}
