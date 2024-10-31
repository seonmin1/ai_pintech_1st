package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 {
    public static void main(String[] args) {
        /*BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b; // <> 안에 참조자료형만 들어가야하므로 int 대신 Integer 사용
        int result = cal.apply(10, 20);
        System.out.println(result);*/

        /*BinaryOperator<Integer> cal = (a, b) -> a + b; // 매개변수가 2개일 때
        int result = cal.apply(10, 20);
        System.out.println(result);*/

        IntBinaryOperator cal = (a, b) -> a + b; // Integer -> int
        int result = cal.applyAsInt(10, 20);
        System.out.println(result);
    }
}
