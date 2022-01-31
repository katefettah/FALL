package Overriding;

public class Animal {
    public static void main(String[] args) {

    }
    public void sound(){
        System.out.println("Animals make sound");
    }
    public Animal move(){
        System.out.println("Animal move");
        return new Animal();
    }
    public void drink(){
        System.out.println("Animal drink water");
    }
    public final void eat(){
        System.out.println("Animals eat");
    }
    public static void breath(){
        System.out.println("Animal breath");
    }
}
