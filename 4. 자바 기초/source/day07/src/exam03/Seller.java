package exam03;

public interface Seller {
    void sell(); // 추상 메서드
    default void order() {
        System.out.println("Seller - 주문!");
    }
}
