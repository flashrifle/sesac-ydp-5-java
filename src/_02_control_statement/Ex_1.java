package _02_control_statement;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("나이를 입력하세요");
//        int age = sc.nextInt();
//        if (age <= 7) {
//            System.out.println("유아");
//        } else if (age >= 8 && age <= 13){
//            System.out.println("초등학생");
//        } else if (age >= 14 && age <= 16){
//            System.out.println("중학생");
//        } else if (age >= 17 && age <= 19){
//            System.out.println("고등학생");
//        } else {
//            System.out.println("성인");
//        }

//        System.out.println("이름을 입력하세요");
//        String str = sc.next();
//        if (str.equals("홍길동")) {
//            System.out.println("남자");
//        } else if (str.equals("성춘향")) {
//            System.out.println("여자");
//        }

        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
