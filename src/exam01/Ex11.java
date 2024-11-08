package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입출력 실습 (DataOutputStream)
 */
public class Ex11 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {

             // 기본형 그대로 쓸 수 있는 형태의 메서드
             dos.writeInt(100);
             dos.writeBoolean(true);
             dos.writeUTF("안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
