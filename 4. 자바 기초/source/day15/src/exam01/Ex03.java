package exam01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Iterator 실습
 * 한번 반복하고 버림
 * 또 반복하기 위해서는 새로운 Iterator 생성해야함
 */
public class Ex03 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        System.out.println(items); // items.toString();

        Iterator<String> iter = items.iterator();

        while(iter.hasNext()) {
            String item = iter.next(); // 다음 요소 가져오기
            System.out.println(item);
        }
        iter = items.iterator(); // 반복을 더 하려면 새로운 Iterator 생성
        while(iter.hasNext()) {
            String item = iter.next(); // 다음 요소 가져오기
            System.out.println(item);
        }
    }
}
