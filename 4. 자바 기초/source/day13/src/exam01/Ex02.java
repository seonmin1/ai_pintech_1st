package exam01;

// 함수형 인터페이스 실습 - Predicate
import java.util.function.IntPredicate;

public class Ex02 {
    public static void main(String[] args) {
        IntPredicate cond1 = x -> x >= 10; // x가 10 이상인 판별식 정의
        IntPredicate cond2 = x -> x <= 100; // x가 100 이하인 판별식 정의
        IntPredicate cond3 = cond1.and(cond2); // 함수 결합 : x >= 10 && x <= 100

        // test 안에 들어간 수가 참인지 거짓인지 판별
        System.out.println(cond3.test(150)); // false
        System.out.println(cond3.test(50)); // true

        IntPredicate cond4 = cond3.negate(); // cond3을 부정 : x < 10 || x > 100
        System.out.println(cond4.test(150)); // true
    }
}
