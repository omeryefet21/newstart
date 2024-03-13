package equals;

public class Program {
    public static void main(String[] args) {


        Person person1 = new Person("omer", 40);
        Person person2 = new Person("omer", 41);
        System.out.println(person2==person1);
        System.out.println(person2.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


    }
}
