import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        int num, guess;
        Scanner sca = new Scanner(System.in);
        num = (int)(Math.random()*6)+1;
        System.out.print("Please enter your guess: ");
        guess=sca.nextInt();
        if (guess>num) {
            System.out.println("guess is bigger");
        }
        else
            if (guess<num) {
                System.out.println("guess if smaller");
            }
            else {
                System.out.println("bingo");
            }
        System.out.println(num);
    }
}
