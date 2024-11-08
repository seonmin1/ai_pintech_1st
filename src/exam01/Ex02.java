package exam01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 입출력 실습 (InputStream)
 * - available 사용하여 읽어올 값이 있을 경우 중단없이 읽어옴
 */
public class Ex02 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            int ch;
            // 1번째 방법
            /*while((ch = fis.read()) != -1) { // 다 읽었을 때 -1 나오면 반복 중단
                System.out.print((char) ch);
            }*/

            // 2번째 방법
             while (fis.available() > 0) { // 0 - 다 읽음
                System.out.print((char) fis.read());
             }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
