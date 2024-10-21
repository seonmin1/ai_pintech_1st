package exam05;

import java.util.List;

public class Juicer {

    // ? - Apple, Grape, Fruit (Fruit으로 상한 제한)
    // Object는 Fruit의 상위 클래스이므로 포함되지 X
    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make(FruitBox<T> fruitBox) {

    }

    // ? - Apple, Fruit, Object (Apple로 하한 제한)
    // Grape는 Apple과 동일한 위치의 클래스이므로 포함되지 X
    public static void make2(FruitBox<? super Apple> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    /*public static void make(FruitBox<Apple> appleBox) {
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }*/

    /* 메서드 중복 정의, 정의 불가 - <>는 컴파일 시 제거되기 때문에 위 메서드와 아래 메서드가 동일한 메서드로 판단됨
    public static void make(FruitBox<Grape> grapeBox) {
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }*/
}
