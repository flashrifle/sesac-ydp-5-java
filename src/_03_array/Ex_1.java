package _03_array;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력 하세요");
        int[] nums = new int[5];
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();
        nums[3] = sc.nextInt();
        nums[4] = sc.nextInt();

        int result = 0;

        for (int sum : nums) {
            result += sum;
        }
        System.out.println("평균 : " + (double) result / 5) ;
        sc.close();
    }
}
