package exam01;

import java.util.Arrays;

/**
 * stream 실습
 * - reduce 누적값 구하기
 */
public class Ex01 {
    public static void main(String[] args) {
        int [] nums = {20, 10, 5, 99, 30, 21, 45};
        int total = Arrays.stream(nums).reduce(0, (acc, n) -> {
            System.out.printf("acc=%d, n=%d%n", acc, n);
            return acc + n;
        });
        System.out.println(total);
    }
}
