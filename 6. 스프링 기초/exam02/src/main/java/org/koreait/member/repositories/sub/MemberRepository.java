package org.koreait.member.repositories.sub;

import org.springframework.stereotype.Repository;

/**
 * 자동스캔 시 value 값 변경하여 적용가능
 * - @Qualifier 사용하지 않아도 된다
 */
@Repository("memRepo2")
public class MemberRepository {
}
