class Animals
{
    //Parent class
}
class Dog extends Animals
{
    void bark()
    {
        System.out.println("Barking...");
    }
}
class Cat extends Animals
{
    void meow()
    {
        System.out.println("Meow!...");
    }
}
public class grow
{
    public static void main(String args[])
    {
        Dog myDog=new Dog();//Dog object
        Cat myCat=new Cat();//Cat object
        myDog.bark();
        myCat.meow();
    }
}