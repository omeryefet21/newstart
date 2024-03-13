package binaryFiles;

public abstract class Shape {


    private double x,y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public void print() {
        System.out.println(getClass().getSimpleName()+": x:"+x+" y:"+y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
