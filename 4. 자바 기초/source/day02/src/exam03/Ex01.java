package exam03;

public class Ex01 {
    public static void main(String[] args) {
        int num = 1, total = 0; // 동일 자료형이면 나열식으로 변수 선언과 초기화 가능
        //int total = 0;
        while (num < 1) {
            total += num; // total = total + num;
            num++; // num = num + 1;
        }
        System.out.println(total);
    }
}
