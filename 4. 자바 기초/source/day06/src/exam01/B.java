package exam01;

public class B extends A { // A 클래스 상속받음
    int numB = 20;

    public B() {
        super(); // 컴파일러가 자동 추가 - A()
        System.out.println("B 생성자!");
    }
}
