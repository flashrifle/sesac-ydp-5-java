package _05_class;

public class Student2Ex {
    public static void main(String[] args) {

        new Student2("김새싹", 20231001, 1);
        Student2.displayInfo();
        new Student2("박지은", 20231002, 2);
        Student2.displayInfo();
        new Student2("이은지", 20231003, 3);
        Student2.displayInfo();

        System.out.printf("총 학생수는 : %d명 입니다.", Student2.getTotalStudents());
    }
}
