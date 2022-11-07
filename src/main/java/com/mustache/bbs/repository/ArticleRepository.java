package com.mustache.bbs.repository;

import com.mustache.bbs.domain.entitiy.Article;
import org.springframework.data.jpa.repository.JpaRepository;


// Dao의 추상화 버전
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // <관리대상Entity, 대표값의 타입(Article의 대표값 id의 타입은 long)>
}
