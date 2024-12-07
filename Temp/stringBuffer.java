public class stringBuffer
{
    public static void main(String args[])    
    {
        StringBuffer sc=new StringBuffer("Rakesh");
        sc.reverse();
        //System.out.println(sc);
        sc.append("swami");
        //System.out.println(sc);
        sc.insert(0,"Siddhapur ");
        //System.out.println(sc);
        StringBuffer obj=new StringBuffer("Hello");
        obj.delete(0,3+1);
        System.out.println(obj);

    }
}
