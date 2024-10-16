package exam05;

public class Outer {

    int num1 = 10; // 외부 클래스에 정의된 인스턴스 자원

    class Inner { // 인스턴스 내부 클래스
        static int num; // 정적 자원 정의 가능 (16버전부터)

        int num1 = 20; // 내부 클래스에 정의된 인스턴스 자원

        void method() {
            System.out.println(num1); // Inner - num1
            System.out.println(Outer.this.num1); // Outer - num1
        }
    }
}
