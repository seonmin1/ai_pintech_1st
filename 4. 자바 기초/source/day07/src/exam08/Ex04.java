package exam08;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A() { // 인터페이스가 아니더라도 상속 없이 실행 중에 메서드 재정의 가능
            @Override
            public void methodA() {
                System.out.println("재정의된 메서드A");
            }
        };
        a.methodA(); // 재정의된 메서드A 출력
    }
}
