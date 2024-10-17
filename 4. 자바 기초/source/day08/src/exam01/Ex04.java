package exam01;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            /*FileInputStream은 Closeable과 AutoCloseable을 인터페이스로 갖고 있음
            FileInputStream의 상위 클래스 Closeable과 AutoCloseable
            Closeable closeable2 = fis; // 다형성 - 위의 이유때문에 가능
            AutoCloseable closeable = fis; // 다형성*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
