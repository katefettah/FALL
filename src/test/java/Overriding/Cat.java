package Overriding;

public class Cat extends Mamal {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
        c.drink();
    }
    public void sound(){
        super.sound();
        System.out.println("cats meowv");
    }
    @Override
    public Cat move(){
        return new Cat();
    }
    @Override
    public void drink(){
        super.drink();
        System.out.println("Cat drink water too");
    }


}
