package computers;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Computer[] computers = new Computer[10];
        for (int i = 0; i < computers.length; i++) {
            if (i % 2 == 0) {
                computers[i] = new Laptop(4 + i, 200 + i * 100, 1000 + i * 1000, (int) (Math.random() * 6), ("pentium" + i), (int) (Math.random() * 9 + 1), 100, Math.random() < 0.5);
            } else {
                computers[i] = new Pc(4 + i, 200 + i * 100, 1000 + i * 1000, (int) (Math.random() * 6), ("pentium" + i), Math.random() < 0.5, (int) (Math.random() * 8 + 11));
            }
        }
//        System.out.println(Arrays.toString(computers));

//        computers[0].print();
//        computers[1].print();
        for (Computer computer:computers) {
            executeActions(computer);
        }
    }

    public static void executeActions(Computer computer) {
        computer.offerAccessories();
        computer.print();
        if (computer instanceof Laptop) {
            ((Laptop) computer).charge();
        }
    }

}
