package exam01;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 실습
 * 솔리드 D원칙 적용하여 Set 사용
 */
public class Ex05 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>(); // 솔리드 D원칙 (다형성)
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름1");
        items.add("이름1");
        items.add("이름1");
        items.add("이름5");

        System.out.println(items);
    }
}
