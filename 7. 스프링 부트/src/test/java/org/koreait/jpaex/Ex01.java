package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

// application.yml, application-test.yml 두 가지 파일을 가져오겠다!
@ActiveProfiles({"default", "test"})
@SpringBootTest
@Transactional // 테스트 완료 시에 테스트 데이터는 삭제
public class Ex01 {
    // @Autowired
    @PersistenceContext
    private EntityManager em; // 엔티티를 관리하는 매니저 객체

    @Test
    void test1() {
        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");
        member.setRegDt(LocalDateTime.now());

        em.persist(member); // 엔티티를 영속성 컨텍스트(관리 메모리) 넣어줌 - 변화감지를 할 수 있는 상태가 된다!

        em.flush(); // DB에 영구 반영 - SQL 실행 - INSERT 쿼리

        member.setName("(수정)사용자01"); // 이름값 변경
        em.flush(); // 변화 감지에 따라서 UPDATE 쿼리 실행

        em.remove(member); // 삭제 X, 영속성 컨텍스트 (변화 감지 메모리)에서 상태를 제거 상태로 변경
        em.flush(); // 변화 감지에 따라서 DELETE 쿼리 실행
    }
}
