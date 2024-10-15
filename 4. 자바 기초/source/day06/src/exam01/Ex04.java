package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        A ac = c; // 본질은 C 객체이나 범위는 A 클래스로 한정, ac와 a는 동일한 객체
        System.out.println(System.identityHashCode(c)); // 주소를 비교해도 동일한 주소
        System.out.println(System.identityHashCode(ac));

        A a = new C(); // C 객체를 만들고 자료형을 A로 한정
        B b = new C(); // C 객체를 만들고 자료형을 B로 한정
    }
}
