package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int numbersEntered=0;
        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Please enter a number: ");
                numbers[i] = scanner.nextInt();
                numbersEntered++;
            }

        }
        catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }
        finally {
            System.out.println("Numbers entered: "+numbersEntered);
        }
        while (true) {
            try {
                System.out.print("Please enter an index: ");
                System.out.println(numbers[scanner.nextInt()]);
                break;
            }
            catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println(e.getClass());
            }
            finally {
                System.out.println("Numbers entered: "+numbersEntered);
            }

        }
        for (int i = 0; i < 1; i++) {

            try {
                System.out.print("Please enter an index: ");
                System.out.println(numbers[scanner.nextInt()]);

            }
            catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println(e.getClass());
                i--;
            }
            finally {
                System.out.println("Numbers entered: "+numbersEntered);
            }

        }
    }
}

