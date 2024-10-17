package exam02;

public class UserIdValidationException extends RuntimeException {
    public UserIdValidationException(String message) { // 생성자 정의, 입력받을 값 정의
        super(message); // 상위 클래스 생성자
    }
}
