package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("문자열을 입력하세요. ");
            input = scanner.nextLine();

            if (!input.equals("exit")) {
                stringList.add(input);
            }

        } while (!input.equals("exit"));

        for (String value : stringList) {
            System.out.println(value);
        }

        scanner.close();

    }
}
