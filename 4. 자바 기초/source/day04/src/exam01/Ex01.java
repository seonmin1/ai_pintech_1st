package exam01;

public class Ex01 {
    public static void main(String[] args) {

       /* int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);*/

        int result1 = add(10, 20); // int add(int, int)
        System.out.println(result1); // 출력값: 30

        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println(result2); // 출력값: 60

    }



    static int add(int num1, int num2) { // 함수 지역
        int result = num1 + num2; // 지역변수 - 함수 지역 내에서만 유의미한 변수

        return result;
    }
    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    static int add(int num1, double num2) {
        return 0;
    }
}
