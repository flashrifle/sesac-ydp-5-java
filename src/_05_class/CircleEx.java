package _05_class;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하시오 :");

        final int r = sc.nextInt();
        Circle c1 = new Circle(r);

        System.out.println("원의 반지름 : "+ (double) r);
        c1.getArea();

    }
}
