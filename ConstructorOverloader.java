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
        System.out.println(brand);
        System.out.println(model);
        System.out.println(mileage);
        System.out.println(price);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        String[] brand={"Maruti", "Nissan", "Mercedes", "BMW", "Hyundai", "Ford", "Tesla", "Audi"};

        int[] carPrice={1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000};

        int[] mileage={10, 20, 30, 40, 50, 60, 70, 80};

        int brandIndex=0;

        for(int i=0;i<8;i++){
            ConstructorOverloader obj=new ConstructorOverloader(brand[brandIndex], "A35", mileage[brandIndex], carPrice[brandIndex]);
            brandIndex++;
        }
    } 
}