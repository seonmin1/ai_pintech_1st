package exam01;

public class Ex05 {
    public static void main(String[] args) {
        A ac = new C(); // 출처가 C 클래스 객체
        A ad = new D(); // 출처가 D 클래스 객체
        System.out.println(ac == ad); // false - 출처가 다르기 때문

        // C c1 = (C)ad; // 상위 클래스 자료형 -> 하위 클래스 자료형 (명시적 형변환)

        if(ad instanceof C) { // instanceof로 ad의 출처가 C인지 확인하는 절차
            C c1 = (C)ad;
        }

        if(ac instanceof C) {
            C c2 = (C)ac;
            System.out.println("유입2");
        }

        if(ac instanceof C c) { // 출처 체크하고 이상없으면 C로 형변환
            System.out.println(c.numC);
        }
    }
}
