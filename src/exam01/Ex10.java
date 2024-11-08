package exam01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자기반 스트림 실습
 * - 바이트기반 스트림으로 hello3 파일 읽어올 때 문자 기반으로 읽어오기
 * - BufferedWriter 사용
 */
public class Ex10 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("hello3.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

             // 문자열을 한줄씩 읽기
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
