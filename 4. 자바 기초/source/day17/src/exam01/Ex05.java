package exam01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays 실습 - 정렬 (오름차순, 내림차순)
 */
public class Ex05 {
    public static void main(String[] args) {
        String[] words = {"이름3", "이름2", "이름1", "이름5", "이름4"};
        Arrays.sort(words, Comparator.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
