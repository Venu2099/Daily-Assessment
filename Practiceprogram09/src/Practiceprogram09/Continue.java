package Practiceprogram09;

public class Continue {
	public static void main(String[] args) 
	{
		System.out.println ("Odd Numbers");
        for (int i = 1; i <= 100; ++i)
    {   // Rest of loop body skipped when i is even
                if (i % 2 == 0)     continue;
                       System.out.println(i + "\t");
        }
	}

}
