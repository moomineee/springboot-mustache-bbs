package com.mustache.bbs.repository;

import com.mustache.bbs.domain.entitiy.Article;
import org.springframework.data.jpa.repository.JpaRepository;


// Dao의 추상화 버전
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
