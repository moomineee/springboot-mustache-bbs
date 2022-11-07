package com.mustache.bbs.domain.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//아래는 그냥 하나의 세트로 인식할 것
// Dto를 Entity로 변환
@Entity
@NoArgsConstructor
@Getter
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
