package exam01;

public class SimpleCalculator extends Calculator { // Calculator 상속받음 (단일 상속만 가능, 다중 상속 불가능)

    public SimpleCalculator() { // 기본 생성자
        super(); // 상위 클래스의 생성자 메서드 (기본 생성자) - Calculator
    }

    @Override // 메서드 재정의
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
