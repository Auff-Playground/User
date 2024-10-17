package com.auff.user;


import com.auff.user.adapters.outbound.persistence.MemberRepository;
import com.auff.user.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

  private final MemberRepository memberRepository;

}
