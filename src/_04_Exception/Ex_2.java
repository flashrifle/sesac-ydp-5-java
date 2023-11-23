package _04_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("배열 크기 입력.");
            int size = sc.nextInt();
            int[] nums = new int[size];
            int result = 0;

            System.out.println("배열 크기만큼 숫자를 넣으시오");

            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i : nums) {
                result += i;
            }
            System.out.println("나눈 값 : " + result/size);
        } catch (InputMismatchException e) {
            System.out.println("입력 값이 숫자가 아니거나 범위를 초과했습니다." + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기는 음수가 될 수 없습니다." + e);
        } catch (ArithmeticException e) {
            System.out.println("배열의 크기는 0일 수 없습니다." + e);
        }
    }
}
