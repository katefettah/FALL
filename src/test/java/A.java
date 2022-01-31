public class A {


    private String name="Selman";
    private int age=43;
    private boolean devOps=true;

    public static void main(String[] args) {
        /*
		 1) Create class A
         2) Create class B
         3) Create a String, an int, and a boolean variable inside the class A
         and encapsulate them all
         4) Make String variable just readable
         5) Make int variable just updatable
         6) Make Boolean variable both readable and updatable
		*/

    }

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isDevOps() {
        return devOps;
    }

    public void setDevOps(boolean devOps) {
        this.devOps = devOps;
    }

}
