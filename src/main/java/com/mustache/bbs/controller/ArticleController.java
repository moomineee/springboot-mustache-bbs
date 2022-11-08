package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.domain.entitiy.Article;
import com.mustache.bbs.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/articles") // 여기서 articles 해주면 밑에서 안써도 됨
@Slf4j // 로깅을 위한 어노테이션 log 사용 가능
public class ArticleController {
    // repository 생성
    private final ArticleRepository articleRepository;
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(value = "/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping(value = "/posts")
    public String createArticle(ArticleDto form) {

        log.info(form.toString()); // println대신 log 사용. @Slf4j(롬복 디펜던시 의존성) 때문에 가능

        Article article = form.toEntitiy(); // Dto를 Entitiy로 변환
        articleRepository.save(article); // Repositroy에게 Entitiy를 DB에 저장하게 한다. articleRepositroy가 save 메소드 호출
                                        // Dto를 entity로 변환시킨 객체 articleEntity를 save
                                        // 최종적으로 save된 데이터를 Article Entitiy 타입으로 반환
        return "";
    }
}

