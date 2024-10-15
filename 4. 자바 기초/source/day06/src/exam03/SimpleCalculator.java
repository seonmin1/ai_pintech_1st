package exam03;

public class SimpleCalculator extends Calculator {
    public SimpleCalculator() { // 기본생성자
        super(); // Calculator()
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
