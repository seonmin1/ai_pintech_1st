package exam01;

import java.util.ArrayList;

/**
 * ArrayList - 순방향, 역방향 제거
 */
public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        for (int i = items.size() -1; i >= 0; i--) {
            String item = items.remove(i);
            System.out.printf("꺼낸 요소: %s%n", item);
        }

        /*for (int i = 0; i < items.size(); i++) {
            items.remove(i); // 0~4까지 삭제
        }*/

        for (int i = 0; i < items.size(); i++) { // 0~4까지 : 인덱스 연산자 0부터 시작
            String item = items.get(i);
            System.out.println(item);
        }

    }
}
