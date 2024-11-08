package exam01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 표준입출력 실습
 */
public class Ex17 {
    public static void main(String[] args) throws Exception {
        /*char ch = (char) System.in.read();
        System.out.println(ch);*/

        // 한글이 깨지지 않고 버퍼 기능 추가 / 코드가 길기 때문에 Scanner 쓰는 것이 일반적
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = (char) br.read();
        System.out.println(ch);
    }
}
