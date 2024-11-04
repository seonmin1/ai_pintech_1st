package exam01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap 실습
 * - 오름차순, 내림차순 출력
 */
public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> items = new TreeMap<>(Comparator.reverseOrder());
        items.put("user05", "사용자05");
        items.put("user01", "사용자01");
        items.put("user02", "사용자02");
        items.put("user04", "사용자04");
        items.put("user03", "사용자03");

        items.forEach((k, v) -> System.out.printf("%s=%s%n", k, v));
    }
}
