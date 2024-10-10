package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int [] nums = new int [4]; // int 자료형 변수 4개 생성
        System.out.println(nums); // 배열 시작 지점 주소

        nums[0] = 10; // 초기화, 이때 nums는 변수명
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        for (int i = 0; i <= 3; i++) { // 0~3
            System.out.println(nums[i]);
        }

        /*
        System.out.println(nums[0]); // 출력값: 10
        System.out.println(nums[1]); // 출력값: 20
        System.out.println(nums[2]); // 출력값: 30
        System.out.println(nums[3]); // 출력값: 40
        */
    }
}
