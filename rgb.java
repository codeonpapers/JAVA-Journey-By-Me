
public class rgb
{
    public static void main(String args[])
    {
        Dog myDog=new Dog();
        myDog.bark();
        Cat myCat=new Cat();
        myCat.meow();
    }
}
class Animals
{

}
class Dog extends Animals
{
    void bark()
    {
        System.out.println("Bark");
    }
}
class Cat extends Animals
{
    void meow()
    {
        System.out.println("Meow");
    }
}