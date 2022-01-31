package abstractionInterface;

public class Cat implements Animal,Mammal,Corona{

    public static void main(String[] args) {
    Cat cat=new Cat();
        System.out.println(Animal.x);
        System.out.println(Mammal.x);
        cat.eat();
    }
    @Override
    public void eat() {
        System.out.println("Cats eat chicken");
    }

    @Override
    public void drink() {

    }
}
