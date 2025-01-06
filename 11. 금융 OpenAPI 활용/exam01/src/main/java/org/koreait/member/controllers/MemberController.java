package org.koreait.member.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/join")
    public void joinPs(@RequestBody RequestJoin form) { // JSON 문자열로 보냈을 때 값을 수신하려면 @RequestBody 설정해줘야 함!
        System.out.println(form);
    }
}
