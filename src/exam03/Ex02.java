package exam03;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * 날짜와 시간 실습
 * - 년, 월, 일 각각 조회하기
 * - 조회 get 메서드 사용
 */
public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        /*int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int day = today.get(ChronoField.DAY_OF_MONTH);*/

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.printf("year=%d, month=%d, day=%d", year, month, day);
    }
}
