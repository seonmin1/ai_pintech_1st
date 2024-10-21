package exam04;

public class Box<T extends Fruit /*& Eatable*/> { // 지네릭 클래스 - T가 Fruit의 하위 클래스임을 명확하게 알 수 있음
    private T item; // Object item

    // private static T item2; // 처음부터 변수인 static은 자료형이 명확하게 정의되어 있어야 함

    // private T[] items = new T[3]; // new 연산자의 역할은 메모리 생성, 자료형이 명확해야지만 할당 용량 계산 가능

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String toString() {
        // Apple item -> info() X
        // Object item X
        // Fruit item O
        String info = item.info(); // apple 또는 grape
        return info;
    }
}
