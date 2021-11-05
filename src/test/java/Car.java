public class Car {
    public static void main(String[] args) {
        Car car01=new Car();
        System.out.println(car01.make);
        System.out.println(car01.price);
        System.out.println(car01.model);

        Car car02=new Car("toyota",12345,"corolla");
        System.out.println(car02.price);
        System.out.println(car02.make);
        System.out.println(car02.model);
    }
    public Car() {

    }

    int price=12000;
    String make="Hondo";
    int year=2000;
    String model="civic";

   Car(String make,int price ,String model){
       this.make=make;
       this.price=price;
       this.model=model;
   }

}
