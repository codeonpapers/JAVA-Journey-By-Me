public class stringLength
{
    public static void main(String args[])    
    {
        //1. length()
        String firstName="Rakesh";
        System.out.println(firstName.length());
        //2. concat()
        String lastName=" Swami";
        String fullName=firstName.concat(lastName);
        System.out.println("Full name: "+fullName);
        //3. charAt()
        System.out.println(firstName.charAt(0));
        //4. equals
        System.out.println(firstName.equals(lastName));
        //5. equalsIgnoreCase()
        System.out.println(firstName.equalsIgnoreCase(lastName));
        //6. compareTo
        System.out.println(lastName.compareTo(firstName));
        //7. compareToIgnoreCase()
        System.out.println(firstName.compareToIgnoreCase(lastName));
    }
}
