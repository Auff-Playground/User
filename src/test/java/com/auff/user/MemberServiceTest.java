package com.auff.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberServiceTest {

  @Autowired
  private MemberService memberService;

  @Autowired
  private MemberRepository memberRepository;

  @Test
  void 생성_후_조회() {
    long id = memberService.create();

    Member member = memberService.find(id);

    assertEquals(id, member.getId());
  }
}
