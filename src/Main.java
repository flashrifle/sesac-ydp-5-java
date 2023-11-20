// - 메인 클래스 ( 시작 클래스 ) 정의
// - main 메서드 가짐
public class Main {
    // 주석
    // 1. // 한 줄
    // 2. /* */ 여러 줄
    // 3. /** */ 문서 주석

    // main 메서드
    // - 자바 응용 프로젝트의 실행 시작점
    // - 애플리케이션이 실행되려면 최소 1개 존재
    // - JVM은 세미콜론으로 끝나는 문장을 하나의 명령문으로 인식
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}