class DownCast
    {
        public static void main(String [ ]args)
        {
            String s = "SVCE";
            Object o = new Object();
            o = s;
            System.out.println("Object data"+o);
            String s1 = (String)o;
            System.out.println("String value:"+s1);
        }
    }