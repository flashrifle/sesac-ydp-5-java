package _05_class._final;

public class ConstEx {
    public static void main(String[] args) {
        // 상수 읽기
        // static 필드이므로 객체 생성없이 클래스명.필드명으로 불러올 수 있음
        System.out.println(Const.MAX_VALUE);
        System.out.println(Const.GREETING);

        // 상수는 final 하므로 값을 수정할 수 없음
//        Const.MAX_VALUE = 2000;
//        Const.GREETING = "Hello Java";
    }
}

