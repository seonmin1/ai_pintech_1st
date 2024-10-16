package exam04;

public class D implements C { // C 인터페이스 상속받음

    @Override
    public void common() { // common 메서드 재정의
        System.out.println("Common 호출");
    }

    @Override
    public void methodC() {

    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
