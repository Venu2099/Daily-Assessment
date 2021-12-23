package Practiceprogram09;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[ ] = {50,20,45,82,25,63};
        int l = num.length;
        int i,j,t;
        System.out.print("Given number : ");
        for (i = 0;i < l;i++ )
        {
              System.out.print("  " + num[i]);
        }
        System.out.println("\n");
        System.out.print("Accending order number : ");
        Array1.sort(num);
        for(i = 0;i < l;i++)
       {
              System.out.print("  " + num[i]);
        }
	}

}
