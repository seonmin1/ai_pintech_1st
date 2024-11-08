package exam01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 문자기반 스트림 실습
 * - 바이트기반 스트림으로 hello3 파일 생성 후 문자기반으로 읽기
 * - BufferedWriter 사용
 */
public class Ex09 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("hello3.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {
             bw.write("안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
