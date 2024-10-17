package exam01;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 5;
            int result = num1 / num2;
            System.out.println(result);

            System.out.println("정상 실행!");

        } catch (ArithmeticException e) {
            e.printStackTrace(); // 오류 정보 확인 - 발생 위치부터 파생 위치까지
            System.out.println("예외 발생!");

        } finally {
            System.out.println("무조건 실행!");
        }
    }
}
