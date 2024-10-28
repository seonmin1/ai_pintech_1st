package exam01;

// 메서드 참조 - 참조 변수 this 사용예제
import java.util.function.Consumer;

public class Book {
    private String title;

    public void test() {
        Consumer<String> opr = (s) -> setTitle(s);
        Consumer<String> opr2 = this::setTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
