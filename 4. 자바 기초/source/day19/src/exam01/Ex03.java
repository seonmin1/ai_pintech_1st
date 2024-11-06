package exam01;

import java.util.List;

/**
 * Stream 실습
 * - 리스트의 글자수가 3자리 이상인지 체크
 * - allMatch, anyMatch
 */
public class Ex03 {
    public static void main(String[] args) {
        List<String> words = List.of("AA", "BBB", "CCC", "DDD", "EEEE");
        boolean result1 = words.stream().allMatch(s -> s.length() >= 3);
        System.out.println(result1);

        boolean result2 = words.stream().anyMatch(s -> s.length() >= 3);
        System.out.println(result2);
    }
}
