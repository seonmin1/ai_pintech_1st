package exam03;

public class Order implements Buyer, Seller { // 다중 인터페이스 구현 가능

    @Override // 메서드 재정의 - 객체가 생성되었다는 의미
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    /*@Override
    public void order() {
      //  Buyer.super.order();
        Seller.super.order();
    }*/

    public void order() {
        System.out.println("주문!");
    }
}
