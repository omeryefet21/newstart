package singleton;

public class Calc {
    private Calc() {
    }

    private static Calc calc=new Calc();

    public static Calc getInstance() {
        return calc;
    }

    public static void setCalc(Calc calc) {
        Calc.calc = calc;
    }

    public int add(int num1, int num2) {
        return num1+num2;
    }
    public int subtract(int num1,int num2) {
        return num1-num2;
    }
    public int multiply(int num1,int num2) {
        return num1*num2;
    }
    public int divide(int num1,int num2) {
        return num1/num2;
    }

}
