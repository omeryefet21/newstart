package serialization;

import inheritence.Circle;
import inheritence.Rectangle;
import inheritence.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Circle circle1 = new Circle();
//        Rectangle rectangle1 = new Rectangle();
//
//        circle1.setX(2);
//        circle1.setY(3);
//        circle1.setRadius(4.6);
//        circle1.print();
//
//        rectangle1.setX(44);
//        rectangle1.setY(2);
//        rectangle1.setHeight(12.1);
//        rectangle1.setLength(2.7);
//        rectangle1.print();
//
//        Shape shape = new Rectangle();
//        System.out.println(shape.toString());
//
//        Rectangle shape2 = new Rectangle();
//        System.out.println(shape2.toString());
//
////        Shape[] shapes=new Shape[]{circle1,rectangle1};
////        shapes[0].print();
////        shapes[1].print();
////
////        circle1.print();


        Scanner scanner = new Scanner(System.in);
        char choice;
        ArrayList<Shape> shapes = new ArrayList<>();
        int shapeCount = 0;
        File shapesBin = new File("shapes2.txt");
        shapesBin.createNewFile();
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        do {
            System.out.println("c- add a circle\nr- add a rectangle\np- print all shapes\ne- exit\nx- print all radius\nd- print all lengths\ns - save to file\nl - load from file\nq - empty list");
            choice = scanner.next().charAt(0);
            try {
                switch (choice) {
                    case 'c':
                        shapes.add(new inheritence.Circle(shapeCount * 2 + 1, shapeCount * 4 + 2, shapeCount * 8 + 1));
                        shapeCount++;
                        break;
                    case 'r':
                        shapes.add(new inheritence.Rectangle(shapeCount * 2 + 1, shapeCount * 4 + 2, shapeCount * 8 + 1, shapeCount * 3 + 3));
                        shapeCount++;
                        break;
                    case 'p':
                        System.out.println(shapes.size() == 0 ? "List is empty!" : "Shapes: ");

                        for (inheritence.Shape s : shapes) {
                            s.print();
                        }
                        break;
                    case 'x':

                        for (inheritence.Shape s : shapes) {
                            if (s instanceof inheritence.Circle)
                                System.out.println(((Circle) s).getRadius());
                        }
                        break;
                    case 'd':

                        for (inheritence.Shape s : shapes) {
                            if (s instanceof inheritence.Rectangle)
                                System.out.println(((Rectangle) s).getLength());
                        }
                        break;
                    case 's':
                        if (shapes.size() != 0) {
                            fileOutputStream = new FileOutputStream(shapesBin);
                            objectOutputStream = new ObjectOutputStream(fileOutputStream);

                            objectOutputStream.writeObject(shapes);

                            objectOutputStream.close();
                            fileOutputStream.close();
                        } else {
                            System.out.println("List is empty");
                        }

                        break;
                    case 'l':
                        if (shapes.size() == 0) {
                            fileInputStream = new FileInputStream(shapesBin);
                            objectInputStream = new ObjectInputStream(fileInputStream);
                        shapes= (ArrayList<Shape>) objectInputStream.readObject();
                            fileInputStream.close();
                            objectInputStream.close();
                        } else {
                            System.out.println("List is not empty. cannot load.");
                        }
                        break;
                    case 'e':
                        System.out.println("bye!");
                        break;
                    case 'q':
                        shapes.clear();
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Array is full");

            }

        }
        while (choice != 'e');


    }
}
