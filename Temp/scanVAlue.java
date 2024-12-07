import java.util.Scanner;
public class scanVAlue
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A value: ");
        int a=sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}