package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null; // 예외가 발생하든 안하든 close(자원 해제) 해야 하므로 try 구문 밖에 입력
        try {
            fis = new FileInputStream("b.txt"); // FileInput을 읽어오는 클래스

        } catch (IOException e) { // FileNotFoundException의 상위 클래스 이므로 IOException만 사용 - 다형성
            e.printStackTrace();
        } finally {
            // 예외가 있던 없던 항상 처리하는 자원 해제
            if (fis != null) {
                try {
                    fis.close(); // 자원 해제
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제!");
        }
    }
}
