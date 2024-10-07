package exam01;

public class Ex09 {
    public static void main(String[] args) {
        byte num1 = 100; // 1바이트

        int num2 = num1; // byte -> int 자료형변경, // 자동 형변환(묵시적 형변환): 작은자료형 -> 큰자료형

        System.out.println(num2);
    }
}
