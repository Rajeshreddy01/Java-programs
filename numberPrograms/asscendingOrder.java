package numberPrograms;

public class asscendingOrder {//desending <

	public static void main(String[] args) {
		String s = "beaiucg";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
		for(char a:ch) {
			System.out.println(a);
		}
	}

}
