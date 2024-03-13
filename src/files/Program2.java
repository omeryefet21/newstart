package files;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        String word = scanner.nextLine();
        System.out.println(word);
        int wordCount = 0;
        StringBuilder stringBuilder = new StringBuilder(line);
        while (stringBuilder.toString().contains(word)) {
            wordCount++;
            stringBuilder.delete(stringBuilder.indexOf(word), stringBuilder.indexOf(word) + word.length());

        }

//        line=line.substring(line.indexOf(word)+word.length());
//        System.out.println(line);
//        line=line.substring(line.indexOf(word)+word.length());
        System.out.println(stringBuilder);
        System.out.println(wordCount);
        System.out.println("Please enter numbers only");
        String input= scanner.nextLine();
        for (int i = 0; i <input.length() ; i++) {
            if (input.charAt(i)>57||input.charAt(i)<48) {
                System.out.println("char");
                break;
            }
            System.out.print(i==input.length()-1?"number":"\r");
        }



    }

}
