package _01_basic_syntax;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        System.out.print("안녕하세요, ");
        System.out.println("저는 김새싹 입니다.");
        System.out.println("잘 부탁드립니다. ");

        // 입력
        System.out.println("공백으로 구분해서 이름, 나이, 키, 결혼 여부를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        boolean single = sc.nextBoolean();

        System.out.println(" 입력결과 출력 ");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("결혼여부 : " + single);
        sc.close();
    }
}
