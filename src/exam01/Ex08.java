package exam01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 문자기반 스트림 실습
 * - hello2 파일 생성
 */
public class Ex08 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("hello2.txt")) {
            fw.write("안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
