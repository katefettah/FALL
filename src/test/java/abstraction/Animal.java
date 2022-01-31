package abstraction;

public abstract class Animal {
    public static void main(String[] args) {

    }
    public abstract void eat();
    public abstract void drink();
    public abstract void breath();

    public void run(){
        System.out.println("animals run");
    }
    public void feed(){
        System.out.println("animals feed ");
    }
}
