package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입출력 실습 (OutputStream)
 * - 한글이 깨져서 나옴 (바이트기반 -> 문자기반 사용해야함)
 */
public class Ex07 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("hello.txt")) {
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
