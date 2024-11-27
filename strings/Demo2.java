package strings;

public class Demo2 {

	public static void main(String[] args) {
		String s = "java";
		String s2 = s+"dev";
		String s1 = new String(s2);
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(s1));
	}

}
