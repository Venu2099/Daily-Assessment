class condemo
    {    int x,y,z;
        condemo() { x=y=z=1; }   // default constructor
        condemo(int a) { x=y=z=a; }     // parameterized constructor
        condemo(int p,int q,int r) { x=p; y=q; z=r; }   // param. Constructor
        condemo(condemo p) {x = p.x; y=p.y;  z=p.z; } //copy constructor
        void sum()
        {    System.out.println("sum of the values:"+ (x+y+z));
        }
    };
    public class constructdemo
    {    public static void main(String args[ ])
        {    condemo c1=new condemo(); //explicit call to default cons.
            condemo c2=new condemo(5); //explicit call to parameterized cons.
            condemo c3=new condemo(1,2,3); //explict call to parameterized cons.
            condemo c4=new condemo(c3); //implicit call to copy cons.
            c1.sum(); c2.sum();
            c3.sum(); c4.sum();
        }
    }