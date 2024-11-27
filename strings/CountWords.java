package strings;

public class CountWords {
    public static void main(String[] args) {
        String s = "Java is easy";

        int a = 0; 
        int b = 0;

        for (int i = 0; i <= s.length(); i++) {
        	if (i == s.length() || s.charAt(i) == ' ') {
                b = i;
                int wordSize = b - a;
                System.out.print("Word: \"");
                for (int j = a; j < b; j++) {
                    System.out.print(s.charAt(j));
                }
                System.out.println("\" has size: " + wordSize);

                // Move to the start of the next word
                a = i + 1;
            }
        }
    }
}

