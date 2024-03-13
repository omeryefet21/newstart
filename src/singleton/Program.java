package singleton;

public class Program {
    public static void main(String[] args) {
//        MySystem mySystem=MySystem.getInstance();
//        System.out.println(mySystem);
//        mySystem.sayHello();
//        mySystem.setA(442);
//        mySystem.sayHello();
//        System.out.println(mySystem);
        Calc calc=Calc.getInstance();
        System.out.println(calc.add(9,4));
        System.out.println(calc.subtract(9,4));
        System.out.println(calc.divide(9,4));
        System.out.println(calc.multiply(9,4));

    }
}
