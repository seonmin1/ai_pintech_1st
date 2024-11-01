package exam01;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 실습
 * - 의존 역전 원칙 사용
 * - 중복 제거, 순서 상관 없음
 * - 내용 순서를 바꿔도 출력값 순서 바뀌지 않음
 * - Hash : 검색
 */
public class Ex01 {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>(); // 의존 역전 원칙
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름1");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items); // 중복 제거
    }
}
