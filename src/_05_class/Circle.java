package _05_class;

public class Circle {
    private static final double PI = Math.PI;
    private int r;

    public Circle() {}

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void getArea() {
        System.out.println("원의 넓이 : " + getR() * getR() * PI);
    }
}
