package _02_control_statement;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("덧셈 결과 : " + sum(x,y));
        System.out.println("뺄셈 결과 : " + sub(x,y));
        System.out.println("나눗셈 결과 : " + div(x,y));
        System.out.println("곱셈 결과 : " + mul(x,y));


        Ex_2 ex = new Ex_2();
        System.out.println("반지름 5인 원의 넓이 : " + ex.calc(5));
        System.out.println("가로4, 세로 7인 직사각형의 넓이 : " + ex.calc(4, 7));
        System.out.println("밑변6, 높이 3인 직사각형의 넓이 : " + ex.calc(6, 3,2));

    }
    public static double sum(int x, int y) {
        return x + y;
    }

    public static double sub(int x, int y ) {
        return x - y;
    }

    public static double div(double x, double y) {
        return x / y;
    }
    public static double mul(int x, int y) {
        return x * y;
    }


    public double calc (int x) {
        double pi = 3.14;
        return x * x * pi;
    }

    public double calc (int x, int y) {
        return x * y;
    }
    public double calc (int x, int y, int z) {
        return x * y / z;
    }

}
