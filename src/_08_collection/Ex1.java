package _08_collection;

import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.println("정수를 입력하세요 -1을 입력하면 종료됩니다.");
        while(true) {
            System.out.print("정수 입력 : ");
            set.add(sc.nextInt());
            if(sc.nextInt() == -1) {
                System.out.println("중복 제거된 정수 목록 : "+ set);
                break;
            }
        }
    }
}
