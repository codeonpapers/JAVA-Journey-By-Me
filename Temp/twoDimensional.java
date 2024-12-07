public class twoDimensional
{
    public static void main(String args[])    
    {
        int milkPrice[][]=new int[5][5];
        int num=10;
        for(int i=0;i<milkPrice.length;i++)
        {
            for(int j=0;j<milkPrice[i].length;j++)
            {
                milkPrice[i][j]=num;
                num++;
            }
        }
        //Print data
        for(int i=0;i<milkPrice.length;i++)
        {
            for(int j=0;j<milkPrice[i].length;j++)
            {
                System.out.print(milkPrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
