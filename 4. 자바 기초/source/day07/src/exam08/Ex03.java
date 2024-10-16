package exam08;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*IntPredicate p = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 1; // 홀수만
            }
        };*/

        /*int[] odds = Arrays.stream(nums).filter(p).toArray();
        System.out.println(Arrays.toString(odds));*/

        int[] odds = Arrays.stream(nums).filter( x -> x % 2 == 1).toArray(); // 고차함수 - 함수를 값으로 사용
    }
}
