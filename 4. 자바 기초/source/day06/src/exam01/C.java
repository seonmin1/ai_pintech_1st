package exam01;

public class C extends B { // B 클래스 상속받음
    int numC = 30;

    public C() {
        super(); // 정의하지 않아도 기본으로 자동생성(컴파일러가 자동추가) - B()
        System.out.println("C 생성자!");
    }
}
