package org.koreait.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor // 생성자 생성
public class MemberController {

    private final JoinValidator joinValidator;
    private final LoginService loginService;

    /**
     * 회원가입양식
     */
    /**
     * th:object="${requestJoin}" 선언 시
     * Get 방식으로 접근해도 오류발생하지 않도록 비어있는 객체를 생성해줌
     */
    /*@GetMapping("/join")
    public String join(Model model) {

        RequestJoin requestJoin = new RequestJoin();
        model.addAttribute("requestJoin", requestJoin);
        return "member/joinForm";
    }*/

    /**
     * 전역에서 유지할 공통적인 속성값 정의
     * - 모든 페이지에서 공유 가능
     * - 이름 설정 필수
     */
    @ModelAttribute("apples")
    public List<String> apples() {
        return List.of("사과1", "사과2", "사과3");
    }

    /**
     * ModelAttribute 애노테이션을 사용하여 RequestJoin 기본 객체 생성
     * - 객체 생성 시 이름은 requestJoin 으로 생성된다
     * - ("변경할 이름")으로 이름 변경이 가능하나 거의 변경하지 않음
     * - 지역 안에서만 유지
     */
    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        return "member/joinForm";
    }

    /**
     * 회원가입처리
     * @Valid : 검증할 커맨드 객체임을 알려줌
     * @Vaild 있으면 반드시 Errors 객체는 커맨드 객체 바로 다음에 나와야 함
     */
    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) {

        // 커맨드 객체 검증 수행
        // joinValidator.validate(form, errors);

        // 검증 실패 - reject, rejectValue가 한번이라도 호출된 경우
        if (errors.hasErrors()) {
            return "member/joinForm"; // 검증 실패 시 사용자에게 양식을 다시 보여주고, 검증 실패 정보를 제공함
        }

        // 검증 성공 - 가입 처리 서비스 호출
        return "redirect:/member/login"; // 가입 성공 시 로그인 페이지로 이동
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form, @CookieValue(name="savedEmail", required = false) String savedEmail) {

        if (savedEmail != null) {
            form.setEmail(savedEmail);
            form.setSaveEmail(true);
        }

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        if (errors.hasErrors()) {
            return "member/login";
        }

        // 검증에 이상이 없는 상태 -> 로그인 처리
        loginService.process(form);

        return "redirect:/";
    }

    @RequestMapping("/logout") // 로그아웃은 어느 기능이든 관계없으므로 RequestMapping 사용
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 비우기
        return "redirect:/member/login"; // 로그아웃 후 로그인 페이지로 이동
    }

    /**
     * MemberController 공통 검증
     * @Valid가 붙어있는 커맨드 객체 공통 검증 처리
     */
    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(joinValidator);
    }*/

}
