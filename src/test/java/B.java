
public class B {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.getName());
        obj.setAge(45);

        System.out.println(obj.isDevOps());
        obj.setDevOps(false);
        System.out.println(obj.isDevOps());

    }

}
