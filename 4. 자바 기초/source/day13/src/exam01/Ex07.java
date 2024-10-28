package exam01;

// 메서드 참조
import java.util.Optional;

public class Ex07 {
    public static void main(String[] args) {
        Optional<Book> opt = Optional.ofNullable(null); // null 값의 Book 객체 생성
        Book book = opt.orElseGet(() -> new Book());
        Book book2 = opt.orElseGet(Book::new);
    }
}
