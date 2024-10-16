package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer(); // 객체 생성이 1번
        Outer.Inner inner = out.new Inner(); // 함수 호출이 2번
        System.out.println(Outer.Inner.num); // 정적 자원 호출 가능 (16버전부터)
        inner.method();
    }
}
