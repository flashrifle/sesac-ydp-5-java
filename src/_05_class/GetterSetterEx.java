package _05_class;

public class GetterSetterEx {

    public static void main(String[] args) {

    GetterSetter gs1 = new GetterSetter("나비", "고양이");

        System.out.printf("%s 는 %s 이었지만 ", gs1.getName(), gs1.getAnimal());
        gs1.setAnimal("말");
        System.out.printf("%s 이 됐읍니다.", gs1.getAnimal());
    }


}
