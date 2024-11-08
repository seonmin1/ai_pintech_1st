package exam01;

import java.io.PrintStream;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        // 에러내용을 콘솔이 아닌 error.log에 출력하게끔 바뀜
        PrintStream ps = new PrintStream("error.log");
        System.setErr(ps);

        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;
    }
}
