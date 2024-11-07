package exam01;

import java.util.Arrays;

/**
 * stream 실습
 * - reduce 최대값, 최소값 구하기
 */
public class Ex02 {
    public static void main(String[] args) {
        int [] nums = {20, 10, 5, 99, 30, 21, 45};
        int max = Arrays.stream(nums).reduce((a, b) -> a > b ? a : b).orElse(-1);
        System.out.println("최대값:" + max);

        int min = Arrays.stream(nums).reduce((a, b) -> a < b ? a : b).orElse(-1);
        System.out.println("최소값:" + min );
    }
}
