package exam05;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        sum(10, 20, 30); // [10, 20, 30]
        sum(10 ,20 ,30 ,40); // [10, 20, 30, 40]
        sum(10 ,20); // [10, 20]

        int[] nums = {10, 20, 30 ,40 ,50}; // [10, 20, 30, 40, 50]
        sum(nums);
    }
    public static int sum(int... nums) { // 가변적 이므로 어떤 형태를 입력해도 배열 형식으로 출력됨
        // nums -> int[] 배열
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
