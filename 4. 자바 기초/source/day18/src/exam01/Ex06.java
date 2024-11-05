package exam01;

import java.util.stream.IntStream;

/**
 * IntStream 실습
 */
public class Ex06 {
    public static void main(String[] args) {
        // 1~100까지 합
        int sum1 = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sum1);

        // 1~100까지 짝수의 합
        int sum2 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).sum();
        System.out.println(sum2);

        // 1~100까지 제곱의 합
        int sum3 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).map(i -> i * i).sum();
        System.out.println(sum3);
    }
}
