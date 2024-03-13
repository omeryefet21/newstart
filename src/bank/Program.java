package bank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account account1=new Account(200.20);
        Scanner scanner=new Scanner(System.in);
        int choice;


        do {
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: "+account1.getBalance());
                    break;
                case 2:
                    account1.deposit();
                    break;
                case 3:
                    account1.withdraw();
                    break;
                case 4:
                    System.out.println("Bye!");

            }

        }
        while (choice!=4);
    }
}
