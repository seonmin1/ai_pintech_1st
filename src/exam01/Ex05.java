package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입출력 실습 (InputStream, OutputStream)
 * - buffer 사용 X
 * - 1바이트씩 data.zip 파일을 읽어와서 1바이트씩 copied_data1.zip 파일로 출력 (1바이트씩 복사)
 */
public class Ex05 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 작업 시작, 현재 시간을 1000분의 1초로 계산
        try (FileInputStream fis = new FileInputStream("data.zip");
             FileOutputStream fos = new FileOutputStream("copied_data1.zip")) {

            while (fis.available() > 0) { // 읽어올 바이트가 있을때까지 반복
                fos.write(fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis(); // 작업 종료
        System.out.printf("걸린시간: %d%n", etime - stime); // 작업 시작부터 종료까지 걸린시간 측정
    }
}
