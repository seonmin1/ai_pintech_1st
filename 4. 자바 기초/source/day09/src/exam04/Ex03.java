package exam04;

public class Ex03 {
    public static void main(String[] args) {
        // Transportation trans = Transportation.SUBWAY;
        Transportation trans = Transportation.BUS;
        String transStr = trans.name(); // trans.toString() - .name은 변경불가 .toString은 변경가능
        System.out.println(transStr);

        int ordinal = trans.ordinal();
        System.out.printf("ordinal:%d%n", ordinal); // 상수가 정의된 순서 위치 번호
    }
}
