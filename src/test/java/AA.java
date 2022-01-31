


class CC{
    public int x=11;
    public void m(){
        System.out.println("Good");
    }
}
 class BB extends CC {
    public int x=12;
    public void m(){
        System.out.println("Bad");
    }
}
public class AA extends BB {
    public static void main(String[] args) {
       BB b=new BB();
       b.m();
        System.out.println(b.x);

        CC d=new BB();
        d.m();
        System.out.println(d.x);

        CC c=new CC();
        c.m();
        System.out.println(c.x);
    }

}
