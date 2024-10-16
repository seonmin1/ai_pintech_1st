package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy(); // 구매
        order.sell(); // 판매

        Buyer buyer = order; // 두 객체는 같은 주소를 참조, 접근 범위만 Buyer로 제한
        buyer.buy();

        Seller seller = order;
        seller.sell();

        order.order(); // order 클래스에 Buyer, Seller 인터페이스가 동시 구현되고 있기 때문에 어떤 쪽을 출력할지 애매함
                        // 따라서 order 클래스에서 메서드 재정의를 통해 확실하게 정의해줘야 함

    }
}
