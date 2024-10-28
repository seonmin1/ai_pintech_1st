package exam01;

// 함수형 인터페이스 실습 - andThen
import java.util.function.Function;

public class Ex01 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length(); // 1. 문자열이 들어오면 문자열 길이를 정수로 반환하는 함수 정의

        Function<Integer, Integer> func2 = x -> x * x; // 2. 1번에서 반환된 정수를 제곱으로 반환하는 함수 정의

        // 함수 결합(합성) : 문자열 -> 정수 길이 -> 제곱
        Function<String, Integer> func3 = func1.andThen(func2); // 3. andThen 함수를 사용하여 func1 수행 후 func2 수행

        int result = func3.apply("ABC"); // 3이 아닌 9 반환
        System.out.println(result);
    }
}
