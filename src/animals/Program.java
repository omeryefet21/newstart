package animals;

public class Program {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Cat cat1=new Cat();
        Chicken chicken1=new Chicken();
        Chair chair1=new Chair();
        checkAnimal(dog1);
        checkAnimal(chicken1);
        checkAnimal(chair1);
        checkAnimal(cat1);
        Apple apple1=new Apple();
        checkAnimal(apple1);
    }
    static void checkAnimal(Object object) {
        if (object instanceof IAnimal) {
            ((IAnimal) object).makeSound();
        }
        else
            System.out.println(object.getClass().getSimpleName().charAt(0)=='A'||object.getClass().getSimpleName().charAt(0)=='O'||object.getClass().getSimpleName().charAt(0)=='I'?"an "+object.getClass().getSimpleName()+" is not an animal":"a "+object.getClass().getSimpleName()+" is not an animal");
    }

}
