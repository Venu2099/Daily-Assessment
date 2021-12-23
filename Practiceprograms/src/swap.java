class swapp
    {    int x=10,y=20;             
        public void swapwot()
        {    x=x+y;
            y=x-y;
            x=x-y;
        }
        public void swapwt()
        {    int temp;
            temp =x;
            x=y;
            y=temp;
        }
        public void display()
        {    System.out.println ("value of x: "+x+"  value of y: "+y);
        }
    }
    public class swap
    {    public static void main(String args[ ])
        {    swapp s=new swapp();            
            s.swapwt();     s.display();
            s.swapwot();     s.display();
        }

	public void readxy() {
		// TODO Auto-generated method stub
		
	}
    }