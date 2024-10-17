package exam01;

public class MyResource implements AutoCloseable { // Alt + 엔터키 - 해결방법 제시됨

    @Override
    public void close() throws Exception { // 예외 전가
        System.out.println("MyResource 자원 해제!");
    }
}
