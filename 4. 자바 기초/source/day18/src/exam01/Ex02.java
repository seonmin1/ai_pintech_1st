package exam01;

import java.util.List;
import java.util.stream.Stream;

/**
 * Stream 실습
 * - 반복 불가, 일회용 객체
 */

public class Ex02 {
    public static <Stirng> void main(String[] args) {
        List<String> items = List.of("항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5");
        Stream<String> stm = items.stream();

        List<String> items2 = stm.distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items2);

        // 오류 발생 - 스트림은 일회용
        List<String> items3 = stm.distinct().map(s -> String.format("**%s**", s)).toList();
        System.out.println(items3);
    }
}
