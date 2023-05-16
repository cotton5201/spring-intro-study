package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity //jpa가 관리하는 entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //identity - db에서 자동생성
    private Long id;
    @Column(name = "name") //실 column 네임이 다를때 사용, 같으면 생략 가능
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
