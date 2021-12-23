package Practiceprogram09;

public class Factorial {
	public static int main(String[] args) 
	{
		int n;
		if (n <= 1)
			return 1;
		else
			return  n*factorial(n - 1);
	}

	public static void main1(String[] args) {
		for (int i = 1; i <= 10; i++)
			System.out.println(factorial(i));
	}

	private static char[] factorial(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
