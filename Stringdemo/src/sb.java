class sb
    {
        public static void main(String args[ ])
        {
        StringBuffer s1,s2,s3;
        s1=new StringBuffer();
        s2=new StringBuffer ("I LOVE MY INDIA");
        s3=new StringBuffer(50);
        System.out.println(s1.capacity());
        System.out.println(s2.capacity());
        System.out.println(s3.capacity());
        System.out.println(s1.capacity()+s2.capacity()+s3.capacity());
        }
    }