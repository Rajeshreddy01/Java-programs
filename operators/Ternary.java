package operators;

public class Ternary {

	public static void main(String[] args) {
		int a=10,b=11,c=12,result;
		result = ((a>b)&& (a>c))? a : b>c ? b : c;
		System.out.println(result + " is bigger");
	}

}
