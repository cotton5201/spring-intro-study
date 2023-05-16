package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //save, findById 등 기본 JpaRepository에서 제공

    //JPOL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
