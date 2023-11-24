package _05_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Rectangle> recList = new ArrayList<>();

        int wid = 0;
        while (true) {
        System.out.println("사각형의 가로 세로 길이를 입력하세요");
        wid = sc.nextInt();
        int hgt = sc.nextInt();
        if ( wid == 0 && hgt == 0) {
            break;
        }
        Rectangle rec = new Rectangle(wid);
        rec.setHeight(hgt);
        recList.add(rec);

        }
        for (Rectangle rec : recList) {
        System.out.println("가로 길이는 : " + rec.getWidth());
        System.out.println("세로 길이는 : " + rec.getHeight());
        System.out.println("넓이는 : " + (rec.getHeight() * rec.getWidth()));
        System.out.println("=====================");
        }
        System.out.println("Rectangle 갯수는 : " + recList.size());


    }
}
