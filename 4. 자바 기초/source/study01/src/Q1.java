public class Q1 {

    public static void main(String[] args) {
        // 10개의 정수를 입력받아 그 수들 짝수의 개수가 몇개인지 출력하는 프로그램

        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                result += 1;
            }
        }
        System.out.printf("짝수의 갯수 : %d%n", result);
    }
}
