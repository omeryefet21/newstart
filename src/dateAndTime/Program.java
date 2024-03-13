package dateAndTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LocalDate date1= LocalDate.now();
        LocalDate birthDate=LocalDate.now();
        System.out.print("Enter day of birth: ");
        date1=date1.minusDays(scanner.nextInt()-1);
        System.out.print("Enter month of birth: ");
        date1=date1.minusMonths(scanner.nextInt()-1);
        System.out.print("Enter year of birth: ");
        date1=date1.minusYears(scanner.nextInt());
        System.out.println("Your age is: "+date1.getYear()+" years, "+(date1.getMonthValue()-1)+" months and "+(date1.getDayOfMonth()-1)+((date1.getDayOfMonth()-1)==1?" day": " days"));
    }
}
