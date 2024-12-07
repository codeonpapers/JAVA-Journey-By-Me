public class jaggedArray
{
    public static void main(String args[])    
    {
        int[][] milkPrice=new int[3][];
        for(int i=0;i<3;i++)
        {
            milkPrice[i]=new int[]{1,2,3,4,5,6,7,8,9};
        }
        for(int i=0;i<milkPrice.length;i++)
        {
            for(int j=0;j<milkPrice[i].length;j++)
            {
                System.out.print(milkPrice[i][j]+"\t");;
            }
            System.out.println();
        }
    }
}
