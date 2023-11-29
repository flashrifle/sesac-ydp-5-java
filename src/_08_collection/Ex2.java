package _08_collection;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String name = "";
        int age = 0;

        System.out.println("이름과 나이를 입력하시오. '종료'를 입력하면 종료됩니다.");
        while(true) {
            System.out.println("이름을 입력하세요.");
            name = sc.next();
            if(name.equals("종료")){
                Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
                Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
                System.out.println("== 입력받은 이름과 나이 목록 ==");
                while (iterator.hasNext()) {
                    Map.Entry<String, Integer> entry = iterator.next();
                    String k = entry.getKey();
                    Integer v = entry.getValue();
                    System.out.printf("이름 : %s 나이: %d %n", k, v);
                }
                break;

            } else {
                System.out.println("나이를 입력하세요.");
                age = sc.nextInt();
                map.put(name, age);
            }
        }
    }

}
