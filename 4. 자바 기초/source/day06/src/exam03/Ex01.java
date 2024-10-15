package exam03;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        SimpleCalculator cal = new SimpleCalculator();
        int result = cal.add(10, 20); // SimpleCalculator의 add값
        System.out.println(result);

        System.out.println(cal.num);
    }
}
