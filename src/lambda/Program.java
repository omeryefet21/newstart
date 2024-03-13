package lambda;

public class Program {
    public static void main(String[] args) {
        int a,b;
        a=9;
        b=4;
        Calc c;
        c= (x,y) ->x+y;
        System.out.println(c.fun1(a,b));
        c=(x,y)->x-y;
        System.out.println(c.fun1(a,b));




    }
}
