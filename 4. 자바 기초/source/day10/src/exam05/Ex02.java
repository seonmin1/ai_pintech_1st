package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make2(appleBox); // Apple, Fruit, Object

        FruitBox<Fruit> grapeBox = new FruitBox<>(); // <>안에 Grape를 입력하면 오류, 다형성을 이용해 Fruit을 입력하면 Grape 출력가능
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make2(grapeBox);
    }
}
