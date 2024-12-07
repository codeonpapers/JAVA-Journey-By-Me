public class continues
{
    public static void main(String args[])
    {
        for(int i=1;i<11;i++)
        {
            if(i%2==0)
            {
                //skip even numbers.
                continue;
            }
            System.out.println(i);
        }
    }
}
