package _05_class._inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("김새싹", 20);

        System.out.println(std1.name);
        System.out.println(std1.age);
        System.out.println(std1.campus);

        std1.say();
        std1.eat("바나나");
        std1.setCampus("서울");
        System.out.println(std1.campus);
    }
}
