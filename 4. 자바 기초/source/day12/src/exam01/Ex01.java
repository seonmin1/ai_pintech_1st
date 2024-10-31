package exam01;

public class Ex01 {
    public static void main(String[] args) {/*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = add2(cal, 10, 20);
        System.out.println(result);*/

        int result = add2((a, b) -> a * b, 10, 20); // 람다식 - 연산은 + 이외에 사용자가 정의한 식으로 변경 가능
        System.out.println(result);
    }

    public static int add2(Calculator cal, int num1, int num2) {
        return cal.add(num1, num2);
    }
}
