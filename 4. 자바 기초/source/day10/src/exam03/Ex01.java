package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox  = new Box();
        appleBox.setItems(new Apple());

        Apple apple = (Apple)appleBox.getItems(); // 명시적 형변환 - 형변환의 번거로움
        System.out.println(apple.info());

        Box grapeBox = new Box();
        grapeBox.setItems(new Grape());

        Grape grape = (Grape)grapeBox.getItems(); // 명시적 형변환 - 형변환의 번거로움
        System.out.println(grape.info());
    }
}
