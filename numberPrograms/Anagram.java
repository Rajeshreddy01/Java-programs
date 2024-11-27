package numberPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "keep";
		String s1 = "peek";
		if(s.length()!=s1.length())
			System.out.println("not an anagram");
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(ch);
		System.out.println(ch1);
		boolean equal = Arrays.equals(ch,ch1);
		if(equal)
			System.out.println("Given Strings are anagrams");
		else
			System.out.println("Given Strings are not an anagrams");
		}

}
