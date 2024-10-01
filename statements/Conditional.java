package statements;

public class Conditional {

	public static void main(String[] args) {
		int a = 61;
		if(a>0)
			System.out.println("thor");
		
		if(a>7)
			System.out.println("asgard");
		else if(a>5)
			System.out.println("loki");
		else
			System.out.println("hela");
		int b=2;
		switch(b)
		{
		case 1:
			System.out.println("odin");
			break;
			default:
				System.out.println("hymdal");
		}
	}

}
