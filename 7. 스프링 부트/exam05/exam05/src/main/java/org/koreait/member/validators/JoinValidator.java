package org.koreait.member.validators;

import org.koreait.global.validators.MobileValidator;
import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator, MobileValidator {
    /**
     * 검증할 커맨드 객체 한정 시 사용
     * - RequestJoin 커맨드 객체만 검증!
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    /**
     * 커맨드 객체 검증 수행
     *
     * Object target
     * - 검증할 커맨드 객체
     *
     * Errors errors
     * - 검증 실패 시 전달할 메세지를 설정하는 역할
     */
    @Override
    public void validate(Object target, Errors errors) {
        RequestJoin form = (RequestJoin) target; // 형변환


        /* 필수항목검증 S
          - email, password, confirmPassword, name, agree */

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String name = form.getName();
        boolean agree = form.isAgree(); // boolean 값은 get 대신 is로 입력

        /*if (email == null || email.isBlank()) { // 이메일이 null 이거나 공백이라면(비어있다면)
            errors.rejectValue("email", "Required", "이메일을 입력하세요."); // 필드명 : 커맨드 객체에 입력한 이름
        }

        if (password == null || password.isBlank()) {
            errors.rejectValue("password", "Required", "비밀번호를 입력하세요.");
        }

        if (confirmPassword == null || confirmPassword.isBlank()) {
            errors.rejectValue("confirmPassword", "Required", "비밀번호를 확인하세요.");
        }

        if (name == null || name.isBlank()) {
            errors.rejectValue("name", "Required", "회원명을 입력하세요.");
        }

        if (!agree) { // 약관에 동의하지 않은 경우
            errors.rejectValue("agree", "Agree", "회원가입 약관에 동의해주세요.");
        }*/

        /*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required", "이메일을 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required", "비밀번호를 확인하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required", "회원명을 입력하세요.");*/

        /*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required" );
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required");

        if (!agree) { // 약관에 동의하지 않은 경우
            errors.rejectValue("agree", "Agree");
        }*/

        /* 필수항목검증 E */

        /* 비밀번호, 비밀번호 확인 일치 여부 체크 */
        if (password != null && confirmPassword != null && !password.equals(confirmPassword)) { // 비밀번호와 비밀번호확인이 null이 아니고 두 값이 다르다면
            errors.rejectValue("confirmPassword", "Mismatch", "비밀번호가 일치하지 않습니다.");
        }

        /* 휴대전화번호 형식 체크 */
        String mobile = form.getMobile();
        if (mobile != null && !mobile.isBlank() && !checkMobile(mobile)) { // mobile이 null이 아니고 값이 있으면서 검증되지 않았을 때
            errors.rejectValue("mobile", "Mobile");
        }

        /*boolean result = false;
        if (!result) {
            errors.reject("Fail.join"); // 특정 필드가 아닌 일반적인 검증 실패
        }*/
    }
}
