package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // Spring boot 가 미리 생성해 둔 객체를 자동으로 연결 (new 로 객체 할당 Skip)
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    private String newArticle() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    private String createArticle(ArticleForm form) {
        System.out.println(form.toString());

        // 1. DTO 를 Entity 로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository 에게 Entity 를 DB 안에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        //TODO: 9강 학습
        return "";
    }
}
