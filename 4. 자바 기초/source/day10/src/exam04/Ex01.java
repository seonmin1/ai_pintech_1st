package exam04;

public class Ex01 {
    public static void main(String[] args) {
        // Box<Apple> appleBox = new Box<Apple>(); // 타입을 Apple로 명시
        Box<Apple> appleBox = new Box<>(); // 뒷부분 Apple 생략 가능
        appleBox.setItem(new Apple());
        // appleBox.setItem(new Grape()); // 타입 안정성 확보

        Apple apple = appleBox.getItem(); // 형변환 X

        // Box<Grape> grapeBox = new Box<Grape>(); // 타입 매개변수의 자료형은 객체 생성 시 결정
        Box<Grape> grapeBox = new Box<>(); // 뒷부분 Grape 생략 가능
    }
}
