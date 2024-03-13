package thread;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int a,b;
        char choice;
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        TimePrintingThread timePrintingThread = new TimePrintingThread();
        timePrintingThread.start();
        do {
            System.out.println("Please choose:\na - add two numbers\ne - exit");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("Please enter 2 numbers:");
                    a= scanner2.nextInt();
                    b= scanner2.nextInt();
                    System.out.println(a+b);
                    break;
                case 'e':
                    System.out.println("Bye!");
                    timePrintingThread.setCancelled(true);
            }
        }
        while (choice!='e');
    }
}
