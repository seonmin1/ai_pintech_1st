package exam01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 기본 자료형 실습
 * - 숫자 배열 오름차순, 내림차순 출력하기
 */
public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {22, 11, 5, 3, 66, 33, 24, 98};

        // 오름차순
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(sortedNums));

        // 내림차순
        int[] sortedNums2 = Arrays.stream(nums)
                // .mapToObj(Integer::valueOf)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(sortedNums2));
    }
}
