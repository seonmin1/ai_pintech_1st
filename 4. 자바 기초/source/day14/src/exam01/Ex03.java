package exam01;

import java.util.Vector;

/**
 * 배열 공간 갯수 확인 실습
 */
public class Ex03 {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>(5); // 초기 용량 5로 지정
        System.out.println("배열 공간 갯수:" + items.capacity()); // 5
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");
        System.out.println("배열 공간 갯수:" + items.capacity()); // 5

        items.add("항목6");
        System.out.println("배열 공간 갯수:" + items.capacity()); // 10 - 2배로 늘어남
    }
}
