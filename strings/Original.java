package strings;

public class Original {

	public static void main(String[] args) {
		String s = "12acb@&89";
		String a="",b="",c="",temp="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
				a+=ch;
			else if(ch>='0'&&ch<='9')
				b+=ch;
			else
				c+=ch;
		}
		temp = a+b+c;
		System.out.println(temp);
	}

}
