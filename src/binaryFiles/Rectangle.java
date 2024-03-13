package binaryFiles;

public class Rectangle extends Shape {

    private double width,height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        super.setX(x);
        super.setY(y);
    }

    public double getLength() {
        return width;
    }

    public void setLength(double length) {
        this.width = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("height: "+height+" length: "+width);
    }
}
