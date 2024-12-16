class Car {
    String brand;
    float milege;
    String model;
    int price;
    Car(String brand, float milege, String model, int price){
        this.brand=brand;
        this.milege=milege;
        this.model=model;
        this.price=price;
        System.out.println("Brand: "+brand);
        System.out.println("Milege: "+milege+" kmpl");
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("------------------------");
    }

}

public class CarMain {
    public static void main(String[] args) {
        String[] brand={"Hyundai", "Mercede", "Maruti", "Nissan"};
        String[] model={};
        Car obj=new Car("Hyundai",25,"Creta",250_00_00);
        Car obj1=new Car("Mercedes",50,"Mercedes-Benz AMG C 63",20_00_00_00);//2
        Car obj2=new Car("BMW",(float)49.75,"BMW M5",19_00_00_00);//3
        Car obj3=new Car(brand[3],(float)49.75,"BMW M5",19_00_00_00);//4
    }
}