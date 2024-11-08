package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입출력 실습 (OutputStream)
 * - b 파일 만들어서 A부터 Z까지 입력하기
 */
public class Ex04 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("b.txt")) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
