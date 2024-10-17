package exam02;

public class LoginService { // 회원 관리 서비스 만들기
    public void process(String userId, String password) /*throws UserIdValidationException, PasswordValidationException*/ {
        // 예외 전가 - 메서드를 호출하는 쪽에서 유연하게 예외 처리 할 수 있도록

        // userId - user01, password - 1234
        if (!userId.equals("user01")) { // userId가 user01과 불일치
            throw new UserIdValidationException("아이디가 일치하지 않습니다."); // 예외 발생시킴
        }
        if (!password.equals("1234")) { // password가 1234와 불일치
            throw new PasswordValidationException("비밀번호가 일치하지 않습니다.");
        }
    }
}
