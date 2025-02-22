package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member") // 특정 주소를 고정하는 역할
public class MemberController {

    // @GetMapping("/member/login")
    /*@RequestMapping(path={"/member/login", "user/login"},
            method={RequestMethod.GET, RequestMethod.POST})
    public String login() {
        System.out.println("로그인 페이지 유입!");
        return "member/form";
    }*/

    //@GetMapping(path="/login", params={"type"})
    //@GetMapping(path="/login", headers="Authorization") // 요청헤더에 Authorization 값이 있는 경우만 유입
    @GetMapping("/login")
    //@GetMapping(path="/login", produces = "application/json") // 응답헤더의 content-Type : application/json
    public String login() {
        System.out.println("로그인 양식!");
        return "member/form";
    }

    @PostMapping("/login") // 실제 주소 - /member/login
    public String loginPs() {
        return "member/form";
    }

    @GetMapping("/join") // 실제 주소 - /member/join
    public String join() { // 회원 가입 양식
        return "member/joinForm";
    }

    @PostMapping("/join") // 실제 주소 - /member/join
    public String joinPs(RequestJoin form/*, Model model*/) { // 회원 가입 처리
        System.out.println(form); // 커맨드 객체는 자동으로 El 속성으로 추가, 속성명이 클래스명, 앞자는 소문자 RequestJoin -> requestJoin
        // model.addAttribute("requestJoin", form);
        /**
         * 회원 가입 처리 완료 후 주소 이동(로그인 페이지)
         * 응답 헤더 Location: /springweb/member/login
         * HttpServletResponse
         * response.sendRedirect(request.getContextPath() + "/member/login");
         */
        return "member/joinForm";
        // return "redirect:/member/login"; // 응답 헤더 Location: /springweb/member/login
        // return "forward:/member/login"; // RequestDispatcher rd = request.getRequestDispatcher("..."); rd.forward(request, response); ...
    }
}
