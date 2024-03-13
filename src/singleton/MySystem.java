package singleton;

public class MySystem {

    private MySystem() {
    }
    private static MySystem mySystem=new MySystem();

    int a=4;

    public static MySystem getInstance() {
        return mySystem;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "MySystem{" +
                "a=" + a +
                '}';
    }
}
