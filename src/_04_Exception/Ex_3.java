package _04_Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            List<List<Integer>> resultArr = new ArrayList<>();
            List<Integer> numbers = new ArrayList<>();

            System.out.println("배열 크기 입력:");
            int size = sc.nextInt();

            System.out.println("배열 크기만큼 숫자를 넣으세요:");
            for (int i = 0; i < size; i++) {
                int input = sc.nextInt();
                numbers.add(input);
            }
            System.out.println("입력된 배열 :"+ numbers);

            List<Integer> currentList = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                int input = numbers.get(i);

                if (!currentList.isEmpty() && currentList.get(0) != input) {
                    resultArr.add(new ArrayList<>(currentList));
                    currentList.clear();
                }

                currentList.add(input);

                // 마지막 숫자이거나 다음 숫자가 다른 경우 처리
                if (i == numbers.size() - 1 || numbers.get(i + 1) != input) {
                    resultArr.add(new ArrayList<>(currentList));
                    currentList.clear();
                }
            }

            // 중복된 숫자가 없는 배열은 결과에서 제외
            resultArr.removeIf(list -> list.size() == 1);

            // 결과 출력
            System.out.println("그룹화된 배열: " + resultArr);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
