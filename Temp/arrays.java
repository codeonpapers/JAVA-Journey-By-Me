public class arrays
{
    public static void main(String args[])    
    {
        int[] milkPrice=new int[3];
        for(int i=0;i<milkPrice.length;i++)
        {
            milkPrice[i]=i;
        }
        for(int i=0;i<milkPrice.length;i++)
        {
            System.out.println(milkPrice[i]);
        }
    }
}
