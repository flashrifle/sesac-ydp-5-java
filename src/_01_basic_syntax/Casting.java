package _01_basic_syntax;

// 형변환
// - 데이터 타입 변환
// - (type) var
//  - type : 데이터 타입
//  - var : 변수명
public class Casting {
    public static void main(String[] args) {
        // 묵시적 형변환
        // - 작은 타입에서 큰 타입으로 자동 형변환
        // - 반대의 경우에는 명시적으로 형변환
        int smallNumber = 10;
        double bigNumber = smallNumber; // int 를 double로 자동 형변환

        System.out.println("smallNumber : " + smallNumber);
        System.out.println("bigNumber : " + bigNumber);

        // 명시적 형변환
        // - 더 큰타입에서 작은 타입으로 강제 변환
        // - 큰 타입에서 작은 타입으로 강제 변환을 하다보니 데이터 손실이 있을 수 있다.
        double anotherBigNumber = 20.5;
        int anotherSmallNumber = (int) anotherBigNumber;

        System.out.println("anotherBigNumber : " + anotherBigNumber);
        System.out.println("anotherSmallNumber : " + anotherSmallNumber);
    }
}
