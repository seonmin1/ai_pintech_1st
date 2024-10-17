package exam01;

public class Ex06 {
    public static void main(String[] args) {
        try (MyResource r1 = new MyResource(); // 해제할 자원이 여러개일 때 뒤에 세미콜론(;) 사용
            MyResource2 r2 = new MyResource2()) {

        } catch (Exception e) {} // MyResource와 MyResource2에 입력된 자원 해제에 대한 메서드 출력 , 예외 전가
    }
}
