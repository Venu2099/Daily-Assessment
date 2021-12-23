class Check
    {    private int amount=0;
        public int getAmount()
        {    return amount;
        }
        public void setAmount(int amt)
        {    amount=amt;
        }
    }
    public class Mainclass
    {    public static void main(String[ ] args)
        {    int amt=0;
            Check obj=new Check();
            obj.setAmount(200);
            amt=obj.getAmount();
            System.out.println("Your current amount is :"+amt);
        }
    }