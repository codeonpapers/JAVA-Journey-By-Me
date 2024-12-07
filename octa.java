public class octa
{
    static final int c=8;
    public static void main(String args[])
    {
        int num=12345;
        
        while(num>0)
        {
            int singleDigit=num%10;
            System.out.println(singleDigit);
            num=num/10;
        }
    }
}
