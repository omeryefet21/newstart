import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex_Enum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        System.out.println(Weekdays.values()[day]);
    }





    enum Weekdays {
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }
}
