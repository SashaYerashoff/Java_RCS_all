import java.io.IOException;

public class HelloMath {

	public static void main(String[] args) throws IOException {
		
		int a = 8;
		int b = 81;
		int c = a + b;
		int d = b + a * a;
		double e = b/ (double)a; //cast double to a
		
		//a = a++ + 1 = 9, a = ++a + 1 = 10
		
		
		System.out.println("a + b = " + c);
		System.out.println("b + a * a = " + d);
		System.out.println("b/a = " + e);
		//System.in.read();
		
		//moduls %
		int x = 191924;
		int y = 3;
		int m = x % y; // 5 mod 3 (5 - 1 * 3)
		System.out.println(" x mod y = " + m);
		
		
		boolean result = (10 != 4);
		System.out.println("result: " + result);
	}

}
