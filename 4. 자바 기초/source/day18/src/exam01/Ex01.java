package exam01;

import java.util.Arrays;
import java.util.List;

/**
 * Stream 실습
 * - 배열, 컬렉션에 적용해보기
 */
public class Ex01 {
    public static void main(String[] args) {
        // 배열 : 중복 제거 -> **문자** 변경 -> 리스트로 변환
        String[] items1 = {"항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5"};
        List<String> cItems1 = Arrays.stream(items1).distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items1); // 원소스는 스트림에서 변경 X
        System.out.println(cItems1);

        // 컬렉션 : 중복 제거 -> **문자** 변경 -> 리스트로 변환
        List<String> items2 = List.of("항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5");
        List<String> cItems2 = items2.stream().distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items2); // 원소스는 스트림에서 변경 X
        System.out.println(cItems2);
    }
}
