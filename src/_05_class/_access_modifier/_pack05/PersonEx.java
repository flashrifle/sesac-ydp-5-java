package _05_class._access_modifier._pack05;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("순신");
        Person p2 = new Person("길동");

        p1.setAge(10);
        System.out.printf("%s 의 나이 : %d %n", p1.getName(), p1.getAge());
        p2.setAge(-6);
        System.out.printf("%s 의 나이 : %d %n", p2.getName(), p2.getAge());


    }
}
