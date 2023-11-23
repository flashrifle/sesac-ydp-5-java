package _04_Exception;

public class Ex_1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        try {
            for (int i = 0; i <=5; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }
    }
}
