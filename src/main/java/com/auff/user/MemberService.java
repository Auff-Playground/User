package com.auff.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public long create() {
    return memberRepository.save(Member.builder().name("jun").build()).getId();
  }

  @Transactional(readOnly = true)
  public Member find(long id) {
    return memberRepository.findById(id).orElseThrow();
  }
}
