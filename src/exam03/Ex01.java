package exam03;

import java.time.LocalDate;

/**
 * 날짜와 시간 실습
 * - 날짜 지정해서 출력하기, 현재 날짜 출력하기
 */
public class Ex01 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 11, 1);
        System.out.println(date1);

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
    }
}
