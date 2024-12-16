public class ConstructorOverloader {
    String brand;
    String model;
    double mileage;
    double price;
    ConstructorOverloader(String brand, String model, double mileage, double price){
        this.brand=brand;
        this.model=model;
        this.mileage=mileage;
        this.price=price;
        display();//Display function call
    }
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Mileage: "+mileage);
        System.out.println("Price: "+price);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        String[] brand={"Maruti", "Nissan", "Mercedes", "BMW", "Hyundai", "Ford", "Tesla", "Audi"};

        int[] carPrice={1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000};

        int[] mileage={10, 20, 30, 40, 50, 60, 70, 80};

        //int brandIndex=0;

        for(int i=0;i<brand.length;i++){
            ConstructorOverloader obj=new ConstructorOverloader(brand[i], "A35", mileage[i], carPrice[i]);
            //brandIndex++;
        }
    } 
}