package exam01;

import java.util.Optional;

/**
 * Optional 객체 생성하기
 */
public class Ex01 {
    public static void main(String[] args) {
        /*String str1 = "ABC";
        Optional<String> opt1 = Optional.of(str1);*/

        String str = null;
        Optional<String> opt = Optional.ofNullable(str);

        // 값이 없으면 NoSuchElementException 발생
        // String str3 = opt.get();
        String str2 = opt.orElse("ABC");
        System.out.println(str2);
    }
}
