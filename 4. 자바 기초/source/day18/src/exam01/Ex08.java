package exam01;

import java.util.Arrays;
import java.util.Random;

/**
 * 스트림 활용 실습
 * - 10개의 난수 만들기
 */
public class Ex08 {
    public static void main(String[] args) {
        Random random = new Random();

        long[] nums = random.longs().limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
