package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItems(new Grape()); // 사과만 담으려고 만든 박스인데 포도를 담음

        // Apple apple = (Apple) appleBox.getItem(); - 타입 안정성이 떨어짐
        Object _apple = appleBox.getItems();
        if (_apple instanceof Apple) {
            Apple apple = (Apple) _apple;
        }
    }
}
