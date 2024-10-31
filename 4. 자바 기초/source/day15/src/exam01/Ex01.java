package exam01;
/**
 * LinkedList 실습
 * 항목 추가 후 조회하기
 * 솔리드 D원칙 적용하여 List 사용
 */

import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>(); // 다형성 - 솔리드의 D원칙
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        for (String item : items) {
            System.out.println(item);
        }
    }
}
