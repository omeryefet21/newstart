package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        File file1 = new File("c:/temp");
        file1.mkdir();
        File file2 = new File("src/files/file535.bin");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        System.out.println(file2.length());
        FileWriter fileWriter1 = new FileWriter(file2, true);
//        for (int i = 0; i < 8; i++) {
//            fileWriter1.write(i + " omer yefet" + (i % 2 == 0 ? " hello" : "") + "\n");
//        }
//        fileWriter1.flush();

        char choice;
        Scanner userScanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(file2);

        System.out.println(fileScanner.nextLine());
        System.out.println(fileScanner.nextLine());


        do {
            System.out.println("r - read and print file\na - add a new line\nh - find the word hello\ne - exit");
            choice = userScanner.nextLine().charAt(0);
            switch (choice) {
                case 'r':
                    fileScanner = new Scanner(file2);
                    while (fileScanner.hasNext()) {
                        System.out.println(fileScanner.nextLine());
                    }
                    fileScanner.close();
                    break;
                case 'a':
              //      Scanner userScanner2 = new Scanner(System.in);
                    //               String temp=userScanner2.nextLine()+"\n";
                    fileWriter1.write(userScanner.nextLine() + "\n");
                    fileWriter1.flush();
                    break;
                case 'h':
                    fileScanner = new Scanner(file2);
                    String line;
                    int wordCount=0;
                    while (fileScanner.hasNext()) {
                        line=fileScanner.nextLine();
                        while (line.contains("hello")) {
                            wordCount++;
                            line=line.substring(line.indexOf("hello")+5);
                            //System.out.println(line);
                        }
                    }
                    System.out.println(wordCount);
                    fileScanner.close();
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            //  userScanner.nextLine();

        }

        while (choice != 'e');
        fileWriter1.close();
        System.out.println(file2.delete());


    }
}
