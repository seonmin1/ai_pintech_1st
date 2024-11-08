package exam01;

import java.io.*;

/**
 * 입출력 실습 (InputStream, OutputStream)
 * - buffer 사용 O / Ex05와 걸린 시간 비교
 * - 1바이트씩 data.zip 파일을 읽어와서 1바이트씩 copied_data1.zip 파일로 출력 (1바이트씩 복사)
 */
public class Ex06 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // 시작 시간
        try (FileInputStream fis = new FileInputStream("data.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("copied_data2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while (bis.available() > 0) {
                bos.write(bis.read());
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
        long etime = System.currentTimeMillis(); // 작업 종료
        System.out.printf("걸린시간: %d%n", etime - stime);
    }
}
