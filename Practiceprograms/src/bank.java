import java.util.Scanner;

	class bank

	    {​​​​​    int bal=500,amount,n,id;

	        Scanner s=new Scanner(System.in);

	        String s1=new String();

	        bankt()

	        {​​​​​    
		System.out.println("Enter the name of the person:");

	            s1=s.nextLine();

	            System.out.println("Enter the person ID:");

	            id=s.nextInt();

	        }​​​​​

	        public void deposit()

	        {​​​​​    System.out.println("Enter amount to be diposited:");

	            amount=s.nextInt();

	            bal=bal+amount;

	        }​​​​​

	                private Object bankt() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object banktransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void draw()

	        {​​​​​    if(bal>500)

	            {​​​​​    System.out.println("Enter the amount to be draw:");

	                n=s.nextInt();

	                if(n%100==0)

	                {​​​​​    bal=bal-n;

	                    System.out.println("Drawn amount is :"+n);

	                }​​​​​

	                else

	                System.out.println("can not possible this amount:");

	            }​​​​​

	            else

	                System.out.println("can not possible:");

	        }​​​​​

	        public void enquiry()

	        {​​​​​    System.out.println(" name of the person:"+s1);

	            System.out.println("person ID:"+id);

	            System.out.println("Account Balence:"+bal);

	        }​​​​​

	    }​​​​​

	
	    class bank

	    {​​​​​    public static void main(String args[ ])

	        {​​​​​    bank gv=new bank(); int ch;

	            Scanner t=new Scanner(System.in);

	            System.out.println("1.deposit:");

	            System.out.println(" 2.draw");

	            System.out.println(" 3.enquiry:");

	            while(true)

	            {​​​​​    System.out.println(" Enter U r choice:");

	                ch=t.nextInt();

	                switch(ch)

	                {​​​​​    case 1: gv.deposit();break;

	                    case 2:    gv.draw();break;

	                    case 3: gv.enquiry();break;

	                    default:

	                        return;

	                }​​​​​

	            }​​​​​

	        }​​​​​

	    }​​​​​


}
