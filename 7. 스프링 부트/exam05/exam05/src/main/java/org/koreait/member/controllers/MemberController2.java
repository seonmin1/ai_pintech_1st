package org.koreait.member.controllers;

import org.koreait.member.entities.Member;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

//@Controller
@RequestMapping("/member") // 주소값 /member 고정
public class MemberController2 {

    @GetMapping("/join") // 주소값 설정
    public String join(Model model) { // 회원 가입
        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setName("사용자01");

        model.addAttribute("requestJoin", form); // View에서 데이터를 사용할 수 있게끔 설정해주는 역할

        return "member/join"; // templates 경로 입력
    }

    @PostMapping("/join")
    public String joinPs() { // 회원 가입 처리
        return "redirect:/member/login"; // 회원가입 완료 후 로그인 페이지로 이동
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> {
                    Member member = new Member();
                    member.setSeq(i);
                    member.setEmail("user" + i + "@test.org");
                    member.setName("<h1>사용자" + i + "</h1>");
                    member.setPassword("12345678");
                    member.setRegDt(LocalDateTime.now());
                    member.setModDt(LocalDateTime.now());

                    return member;
                }).toList();

        model.addAttribute("members", members);

        return "member/list";
    }
}
