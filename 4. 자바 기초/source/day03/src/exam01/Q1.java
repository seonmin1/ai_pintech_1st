package exam01;

public class Q1 {
    public static void main(String[] args) {
        //변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int num1 = 20;
        double num2 = 3.63; // 값을 3으로 대입하면 처음에 int로 인식하고 나중에 double로 바뀌기 때문에 일을 2번하게되어 효율적이지 않음

        //int result = num1 * (int)num2; // 오답
        int result = (int)(num1 * num2);
        System.out.println(result);
    }
}
