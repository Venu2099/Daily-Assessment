public class Arithmeticdemo {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		int x = 4;
		int y = 6;
		int z = 10;
		int result = 0;

		result = x + y;
		System.out.println("the addition of(x+y):" + result);
		result = x - y;
		System.out.println("the sub is(x-y):" + result);
		result = x * y;
		System.out.println("the addition of(x*y):" + result);
		result = x / y;
		System.out.println("the sub is(x/y):" + result);
		result = x + (y * (z / x));
		System.out.println("The result is now :" + result);
	}

}