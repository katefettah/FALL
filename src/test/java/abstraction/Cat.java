package abstraction;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.breath();
        cat.drink();
        cat.eat();
        cat.feed();
        cat.run();
    }

    @Override
    public void eat() {
        System.out.println("cat food");
    }

    @Override
    public void drink() {
        System.out.println("water");
    }

    @Override
    public void breath() {
        System.out.println("many times");

    }
}
