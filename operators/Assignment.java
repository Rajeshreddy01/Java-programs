package operators;

public class Assignment {

	public static void main(String[] args) {
//		int a = 10,b=4;// here the value 10 is assigned to variable a
//		System.out.println(a);
//		a=a+5;// we can write this in a simple manner by using assign(=) operator
//		System.out.println(a);
//		a+=5;
//		System.out.println(a);
//		b-=2;
//		System.out.println(b);
//		b*=3;
//		System.out.println(b); 
		int f = 7;
        System.out.println(f += 3);//10
        System.out.println(f -= 2);//8
        System.out.println(f *= 4);//32
        System.out.println(f /= 3);//10
        System.out.println(f %= 2);//0
        System.out.println(f &= 0b1010);
        System.out.println(f |= 0b1100);
        System.out.println(f ^= 0b1010);
        System.out.println(f <<= 2);
        System.out.println(f >>= 1);
        System.out.println( f >>>=1);

	}

}
