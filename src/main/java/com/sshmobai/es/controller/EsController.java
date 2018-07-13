package com.sshmobai.es.controller;

import java.util.Date;
import java.util.Iterator;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sshmobai.es.dao.EsDao;
import com.sshmobai.es.model.Article;
import com.sshmobai.es.model.Author;
import com.sshmobai.es.model.Tutorial;
import com.sshmobai.es.service.EsService;

@RestController
public class EsController {
//    @Autowired
//    private EsDao articleSearchRepository;
    
    @Autowired
    private EsService esServiceImpl;
    
    @RequestMapping("/add")
    public void testSaveArticleIndex() {
//        Author author = new Author();
//        author.setId(1L);
//        author.setName("mobai");
//        author.setRemark("java developer");
//
//        Tutorial tutorial = new Tutorial();
//        tutorial.setId(1L);
//        tutorial.setName("elastic search");
//
//        Article article = new Article();
//        article.setId(1L);
//        article.setTitle("springboot integreate elasticsearch");
//        article.setAbstracts("springboot integreate elasticsearch is very easy");
//        article.setTutorial(tutorial);
//        article.setAuthor(author);
//        article.setContent("elasticsearch based on lucene,"
//                + "spring-data-elastichsearch based on elaticsearch"
//                + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
//        article.setPostTime(new Date());
//        article.setClickCount(1L);
//
//        articleSearchRepository.save(article);
        
        esServiceImpl.save();
    }

    @RequestMapping("/query")
    public void testSearch() {
//        String queryString = "springboot";//搜索关键字
//        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
//        Iterable<Article> searchResult = articleSearchRepository.search(builder);
//        Iterator<Article> iterator = searchResult.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    	
        esServiceImpl.query();
    }
    
}
