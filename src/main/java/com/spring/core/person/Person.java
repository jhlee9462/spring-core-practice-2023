package com.spring.core.person;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
//@Data
public class Person {

    private String nickName;
    private String address;
    private int age;

}
