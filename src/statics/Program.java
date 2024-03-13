package statics;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        char choice;
        Scanner scanner=new Scanner(System.in);
        Numbers a=new Numbers(0);
        Numbers b=new Numbers(6);
        Numbers c=new Numbers(2);
//        a.add();
//        b.add();
//        c.add();

        do {
            System.out.println("Please enter a b c");
            choice=scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    a.add();
                    break;
                case 'b':
                    b.add();
                    break;
                case 'c':
                    c.add();
                    break;
                case 'e':
                    System.out.println("bye");
                    break;
            }
        }
        while (choice != 'e');
        Numbers d=new Numbers(99);
        d.add();


    }

}

