public class charCasting
{
    public static void main(String args[])    
    {
        char myNameInitial='R';
        int myNameInInt=(int)myNameInitial;
        System.out.println(myNameInInt);
        if(myNameInitial==myNameInInt)
        {
            System.out.println("Matched");
        }
        else
        {
            System.out.println("Doesn't match");
        }
    }
}
