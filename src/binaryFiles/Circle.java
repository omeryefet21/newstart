package binaryFiles;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        super.setX(x);
        super.setY(y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void print() {
        super.print();
        System.out.println("radius: "+radius);
    }
}




