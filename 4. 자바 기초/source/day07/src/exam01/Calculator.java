package exam01;

public abstract class Calculator { // 추상 클래스

    public Calculator() { // 기본 생성자 - 컴파일러가 자동 생성
        System.out.println("Calculator 생성자!");
    }

    public abstract int add(int num1, int num2); // 추상 메서드 (인스턴스 메서드)

    public void method() {
        System.out.println("Calculator!");
    }
}
