package _05_class;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle (int width) {
        this.width = width;
    }

    public void getArea(int width, int height) {
        System.out.println(width * height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
