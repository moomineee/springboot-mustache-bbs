package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entitiy.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article toEntitiy() {
        return new Article(title, content);
    }
}
