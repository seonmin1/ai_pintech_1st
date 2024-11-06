package exam01;

import java.util.Random;

/**
 * Stream 실습
 * - 랜덤 숫자 중 첫번째 발견한 홀수 가져오기
 */
public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();
        int odd = random.ints().filter(x -> x % 2 == 1).findFirst().orElse(-1);
        System.out.println(odd);
    }
}
