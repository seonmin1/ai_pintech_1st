package exam03;

public interface Buyer {
    int NUM =  10; // public static final 생략됨 - 정적 상수

    void buy(); // 추상 메서드
    default void order() { // 인스턴스 메서드 - default 입력
        System.out.println("Buyer - 주문!");
    }

    private void privateMethod() { // JDK9
        System.out.println("private 메서드!");
    }

    public static void staticMethod() { // public
        System.out.println("정적 메서드!");
    }
}
